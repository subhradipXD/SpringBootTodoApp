package com.todoapp.todoApp.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class Todo {
    private int id;
    private String username;

    @Size(min = 1, message = "Please Enter Your Todo!")
    private String description;
    private LocalDate targetDate;
    private boolean done;

    @Override
    public String toString() {
        return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
                + targetDate + ", done=" + done + "]";
    }

    public Todo(String description, boolean done, int id, LocalDate targetDate, String username) {
        this.description = description;
        this.done = done;
        this.id = id;
        this.targetDate = targetDate;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
