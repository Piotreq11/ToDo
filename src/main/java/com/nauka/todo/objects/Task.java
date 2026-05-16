package com.nauka.todo.objects;

import com.nauka.todo.Priority;

public class Task {
    static int counter = 0;
    private int id;
    private String tresc;
    private Priority priorytet;
    private boolean czyZrobione;

    public Task(String tresc, Priority priorytet, boolean czyZrobione) {
        this.id = counter++;
        this.tresc = tresc;
        this.priorytet = priorytet;
        this.czyZrobione = czyZrobione;
    }

    public int getId() {
        return id;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public Priority getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(Priority priorytet) {
        this.priorytet = priorytet;
    }

    public boolean isCzyZrobione() {
        return czyZrobione;
    }

    public void setCzyZrobione(boolean czyZrobione) {
        this.czyZrobione = czyZrobione;
    }
}
