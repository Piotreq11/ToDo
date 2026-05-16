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

    public WebController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("zadania", taskService.getZadania());
        model.addAttribute("zrobione", taskService.getZrobione());
        return "index";
    }

    @PostMapping("/")
    public String pobierzWartosci(@RequestParam String tresc, @RequestParam Priority priorytet) {
        taskService.dodajZadanie(new Task(tresc, priorytet, false));
        return "redirect:/";
    }

    @PostMapping("/zrob/{id}")
    public String zrobZadanie(@PathVariable("id") int id) {
        taskService.zrobZadanie(id);
        return "redirect:/";
    }

    @PostMapping("/usun/{id}")
    public String usunZadanie(@PathVariable("id") int id){
        taskService.usunZadanie(id);
        return "redirect:/";
    }
}
