package com.tt1.test;

import com.tt1.test.muck.DBFake;
import org.junit.jupiter.api.BeforeEach;

public class IRepositorioTest extends IRepositorioTestTemplate{
    @Override
    @BeforeEach
    void setup() {
        super.repo = new Repositorio(new DBFake());
    }
}