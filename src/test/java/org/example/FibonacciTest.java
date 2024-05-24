package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    void testFibonacci_shouldBeFibAdded_when4Runs() {
        String expected = "1 2 3 5 ";

        assertEquals(expected, Fibonacci.sumFib(4));
    }

}
