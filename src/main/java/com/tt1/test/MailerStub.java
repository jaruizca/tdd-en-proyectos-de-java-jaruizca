package com.tt1.test;

public class MailerStub implements IMailer {
    @Override
    public boolean enviarEmail(String direccion, String mensaje) {
        System.out.println("enviado a: " + direccion);
        System.out.println("el mensaje: " + mensaje);
        return !direccion.isEmpty();
    }
}