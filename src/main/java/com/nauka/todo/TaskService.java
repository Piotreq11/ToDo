package com.nauka.todo;

import com.nauka.todo.objects.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskService {

    private final ArrayList<Task> zadania = new ArrayList<>();

    public void dodajZadanie(Task task) {
        zadania.add(task);
        System.out.println("Dodano nowe zadanie o ID: " + task.getId());
    }

    public ArrayList<Task> getZadania() {
        ArrayList<Task> doZrobienia = new ArrayList<>();
        for (Task t : zadania) {
            if (!t.isCzyZrobione())
                doZrobienia.add(t);
        }
        return doZrobienia;
    }

    public void usunZadanie(int id) {
        for (Task task : zadania) {
            if (task.getId() == id) {
                zadania.remove(task);
                System.out.println("Zadanie o id: " + id + " zostało usunięte.");
                break;
            }


        }
    }

    public ArrayList<Task> getZrobione() {
        ArrayList<Task> zrobione = new ArrayList<>();
        for (Task t : getZadania()) {
            if (t.isCzyZrobione())
                zrobione.add(t);
        }
        return zrobione;
    }

    public void zrobZadanie(int id) {
        for (Task task : zadania) {
            if (task.getId() == id) {
                task.setCzyZrobione(true);
                System.out.println("Zaktualizowano zadanie o id: " + task.getId() + " status zadania: " + task.isCzyZrobione());
                break; // Znaleźliśmy zadanie, przerywamy pętlę
            }
        }
    }
}
