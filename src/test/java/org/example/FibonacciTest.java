package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    private int x = 0, y = 1;

    @Test
    void testFibonacci_shouldBeFibAdded_when4Runs() {
        String expected = "1 2 3 5 ";

        assertEquals(expected, Fibonacci.sumFib(4));
    }

}
