package com.nauka.todo;

import com.nauka.todo.objects.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskService {

    private final ArrayList<Task> zadania = new ArrayList<>();

    public void dodajZadanie(Task task){
        zadania.add(task);
    }

    public ArrayList<Task> getZadania() {
        return zadania;
    }
    public void usunZadanie(Task task){
        zadania.remove(task);
    }
}
