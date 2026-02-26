package com.tt1.test;

import java.util.List;

public interface IDB {
    // ToDo
    ToDo getTodo(Integer id);
    void updateTodo(Integer id, ToDo todo);
    void deleteTodo(Integer id);
    Integer createTodo(ToDo todo);
    List<ToDo> getTodos();

    // Email
    List<String> getEmails();
    String getEmail(Integer id);
    void updateEmail(Integer id, String email);
    void deleteEmail(Integer id);
    Integer createEmail(String email );
}