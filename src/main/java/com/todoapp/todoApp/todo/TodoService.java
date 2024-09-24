package com.todoapp.todoApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int id = 0;
    static {
        todos.add(new Todo("korte hobe 1", false, ++id, LocalDate.now().plusYears(1), "Subhradip"));
        todos.add(new Todo("korte hobe 2", false, ++id, LocalDate.now().plusYears(1), "Subhradip"));
        todos.add(new Todo("korte hobe 3", false, ++id, LocalDate.now().plusYears(1), "Subhradip"));

    }

    public List<Todo> findByUsername(String username) {
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);

        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String description, boolean done, LocalDate targetDate, String username) {
        Todo todo = new Todo(description, done, ++id, targetDate, username);
        todos.add(todo);
    }

    public void deleteByID(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteByID(todo.getId());
        todos.add(todo);
    }
}
