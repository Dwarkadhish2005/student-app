package com.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAdd() {

        App app = new App();

        assertEquals(
                30,
                app.add(10,20)
        );
    }
}