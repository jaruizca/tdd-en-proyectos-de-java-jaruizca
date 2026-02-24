package com.tt1.test;

public interface IMailer {
    // Devuelve true si el email se ha envíado
    // correctamente y falso si ha ocurrido algún fallo.
    boolean enviarEmail(String direccion, String mensaje);
}