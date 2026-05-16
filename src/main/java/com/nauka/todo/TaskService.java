package com.nauka.todo;

import com.nauka.todo.objects.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskService {

    private final ArrayList<Task> zadania = new ArrayList<>();

    public void dodajZadanie(Task task){
        zadania.add(task);
        System.out.println("Dodano nowe zadanie o ID: "+ task.getId());
    }

    public ArrayList<Task> getZadania() {
        return zadania;
    }
    public void usunZadanie(Task task){
        zadania.remove(task);
    }

    public void zrobZadanie(int id){
        zadania.get(id).setCzyZrobione(true);
    }
}
