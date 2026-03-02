package com.tt1.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IDBTest {
    IDB db;
    @BeforeEach
    void setup() {
        this.db = new DBStub();
    }


    @Test
    void todo() {
        ToDo todo = new ToDo();
        int id = db.createTodo(todo);
        assertEquals(todo, db.getTodo(id));


        ToDo todo2 = new ToDo();
        todo2.setNombre("todo2");
        db.updateTodo(id, todo2);
        assertEquals(todo2, db.getTodo(id));

        db.deleteTodo(id);

        assertNull(db.getTodo(id));
    }

    @Test
    void getTodos() {
        int initial = db.getTodos().size();

        ToDo t1 = new ToDo();
        ToDo t2 = new ToDo();
        ToDo t3 = new ToDo();
        t1.setNombre("todo1");
        t2.setNombre("todo2");
        t3.setNombre("todo3");
        t1.setId(1);
        t2.setId(2);
        t3.setId(3);

        db.createTodo(t1);
        db.createTodo(t2);
        db.createTodo(t3);

        List<ToDo> todos = db.getTodos();

        assertEquals(3, todos.size() - initial);

        assertTrue(todos.contains(t1));
        assertTrue(todos.contains(t2));
        assertTrue(todos.contains(t3));
    }


    // EMAILS
    @Test
    void email() {
        String email = "user@email.com";

        int id = db.createEmail(email);
        assertEquals(email, db.getEmail(id));

        db.updateEmail(id, "notuser@email.com");
        assertEquals("notuser@email.com", db.getEmail(id));

        db.deleteEmail(id);
    }

    @Test
    void getEmails() {
        int initial = db.getEmails().size();

        db.createEmail("u1@email.com");
        db.createEmail("u2@email.com");
        db.createEmail("u3@email.com");

        List<String> emails = db.getEmails();

        assertEquals(3, emails.size() - initial);

        assertTrue(emails.contains("u1@email.com"));
        assertTrue(emails.contains("u2@email.com"));
        assertTrue(emails.contains("u3@email.com"));
    }
}