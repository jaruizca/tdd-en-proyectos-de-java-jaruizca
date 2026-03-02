package com.tt1.test;

import java.util.List;

public class Repositorio implements IRepositorio {

    public Repositorio(IDB db) { }

    public ToDo obtenerTodo(Integer i) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    public void marcarToDoComoCompletado(Integer i) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    public void guardarTodo(ToDo todo) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    public void guardarEmail(String email) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public List<String> obtenerEmails() {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }
}