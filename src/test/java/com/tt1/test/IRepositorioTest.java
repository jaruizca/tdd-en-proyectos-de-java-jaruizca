package com.tt1.test;

import com.tt1.test.muck.DBFake;
import org.junit.jupiter.api.BeforeEach;

public class IRepositorioTest extends IRepositorioTestTemplate{
    IDB db;
    @Override
    @BeforeEach
    void setup() {
        db = new DBFake();
    }
}