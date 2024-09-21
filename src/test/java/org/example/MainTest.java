package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testAdd() {
        Main calculator = new Main();
        int result = calculator.add(9, 4);
        assertEquals(13, result, "The addition result should be 13");
    }
}
