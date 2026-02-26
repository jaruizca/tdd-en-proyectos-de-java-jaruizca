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

        db.createTodo(t1);
        db.createTodo(t2);
        db.createTodo(t3);

        List<ToDo> todos = db.getTodos();

        assertEquals(3, todos.size() - initial);

        assertTrue(todos.contains(t1));
        assertTrue(todos.contains(t2));
        assertTrue(todos.contains(t3));
    }
}