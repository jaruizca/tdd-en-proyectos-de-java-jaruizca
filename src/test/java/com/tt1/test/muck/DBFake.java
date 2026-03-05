package com.tt1.test.muck;

import com.tt1.test.IDB;
import com.tt1.test.ToDo;

import java.util.List;

public class DBFake implements IDB {
    ToDo storedToDo = null;
    String storedEmail = "";

    @Override
    public ToDo getTodo(Integer id) {
        return storedToDo;
    }

    @Override
    public void updateTodo(Integer id, ToDo todo) {
        storedToDo = todo;
    }

    @Override
    public void deleteTodo(Integer id) {
        storedToDo = null;
    }

    @Override
    public Integer createTodo(ToDo todo) {
        storedToDo = todo;
        return todo.getId();
    }

    @Override
    public List<ToDo> getTodos() {
        return List.of(storedToDo);
    }

    @Override
    public List<String> getEmails() {
        return List.of(storedEmail);
    }

    @Override
    public String getEmail(Integer id) {
        return storedEmail;
    }

    @Override
    public void updateEmail(Integer id, String email) {
        storedEmail = email;
    }

    @Override
    public void deleteEmail(Integer id) {
        storedEmail = "";
    }

    @Override
    public Integer createEmail(String email) {
        storedEmail = email;
        return 1;
    }
}
