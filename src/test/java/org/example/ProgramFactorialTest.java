package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProgramFactorialTest {

    @Test
    void factorialOfZeroIsOne() {
        assertEquals(1, ProgramFactorial.calculate(0));
    }

    @Test
    void factorialOfFiveIs120() {
        assertEquals(120, ProgramFactorial.calculate(5));
    }

    @Test
    void factorialOfTwentyIsCorrect() {
        assertEquals(2432902008176640000L, ProgramFactorial.calculate(20));
    }

    @Test
    void negativeArgumentThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> ProgramFactorial.calculate(-1));
    }

    @Test
    void tooBigArgumentThrowsException() {
        assertThrows(ArithmeticException.class, () -> ProgramFactorial.calculate(21));
    }
}