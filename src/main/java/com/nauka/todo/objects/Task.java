package com.nauka.todo.objects;

import com.nauka.todo.Priority;

public class Task {
    private int id;
    private String tresc;
    private Priority priorytet;
    boolean czyZrobione;

    public Task(int id, String tresc, Priority priorytet, boolean czyZrobione) {
        this.id = id;
        this.tresc = tresc;
        this.priorytet = priorytet;
        this.czyZrobione = czyZrobione;
    }

}
