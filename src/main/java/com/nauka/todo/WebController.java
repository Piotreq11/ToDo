package com.nauka.todo;

import com.nauka.todo.objects.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    private final TaskService taskService;

    public WebController(TaskService taskService){
        this.taskService=taskService;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("zadania", taskService.getZadania());
        return "index";
    }

    @PostMapping("/")
    public String pobierzWartosci(@RequestParam String tresc, @RequestParam String priorytet){
        switch(priorytet){
            case "MIN":
                taskService.dodajZadanie(new Task(tresc, Priority.MIN, false));
                break;
            case "MED":
                taskService.dodajZadanie(new Task(tresc, Priority.MED, false));
                break;
            case "MAX":
                taskService.dodajZadanie(new Task(tresc, Priority.MAX, false));
                break;
            default:
                taskService.dodajZadanie(new Task(tresc, Priority.MIN, false));
                break;
        }
        return "redirect:/";
    }

    @GetMapping("/zrob/{id}")
    public String zrobZadanie(@PathVariable("id") int id){
        taskService.zrobZadanie(id);
        return "redirect:/";
    }
}
