package com.tt1.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMailer {

    IMailer mailer = new MailerStub();

    @BeforeAll
    static void setup() { }

    @AfterAll
    static void tearDown() { }

    @Test
    void testEnviarEmail() {
        assertTrue(mailer.enviarEmail("test@unirioja.es", "hola mundo"));
        assertFalse(mailer.enviarEmail("", ""));
    }
}
