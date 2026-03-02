package com.tt1.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class IRepositorioTestTemplate {
    IRepositorio repo;

    @BeforeEach
    abstract void setup();

    @Test
    void obtenerEmails() {
        String mail = "mymail@email.com";
        repo.guardarEmail(mail);
        assertTrue(repo.obtenerEmails().contains(mail));
    }

    @Test
    void obtenerTodo() {
        ToDo todo = new ToDo();
        todo.setNombre("Paco");
        todo.setId(1);

        repo.guardarTodo(todo);
        assertEquals(todo, repo.obtenerTodo(1));

        repo.marcarToDoComoCompletado(1);
        assertTrue(repo.obtenerTodo(1).getCompletado());
    }
}