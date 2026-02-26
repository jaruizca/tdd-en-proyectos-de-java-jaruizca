package com.tt1.test;

import java.util.List;
import java.util.Map;

public class DBStub implements IDB {
    private Map<Integer,ToDo> tabla;


    @Override
    public ToDo getTodo(Integer id) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public void updateTodo(Integer id, ToDo todo) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public void deleteTodo(Integer id) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public Integer createTodo(ToDo todo) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    // Email
    @Override
    public List<String> getEmails() {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public String getEmail(Integer id) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public void updateEmail(Integer id, String email) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public void deleteEmail(Integer id) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public Integer createEmail(String email ) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }
}