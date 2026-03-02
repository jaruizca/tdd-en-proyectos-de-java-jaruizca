package com.tt1.test;

import com.tt1.test.muck.DBFake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RepositorioIntegracionTest extends IRepositorioTestTemplate {
    IDB db;

    @Override
    @BeforeEach
    void setup() {
        db = new DBStub();
    }

}
