package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAddition() {
        assertEquals(5, App.somme(2, 3));
    }
}
