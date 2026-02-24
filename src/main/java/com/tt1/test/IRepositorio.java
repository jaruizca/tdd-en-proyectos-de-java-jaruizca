package com.tt1.test;

public interface IRepositorio {
    ToDo obtenerTodo(Integer i);
    void marcarToDoComoCompletado(Integer i);
    void guardarTodo(ToDo todo);
    void guardarEmail(String email);
}