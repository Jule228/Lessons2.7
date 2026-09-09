package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProgramArithmeticTest {

    private static final double DELTA = 1e-9;

    @Test
    void addWorksWithPositiveAndNegativeNumbers() {
        assertEquals(17, ProgramArithmetic.add(12, 5));
        assertEquals(1, ProgramArithmetic.add(-2, 3));
        assertEquals(-5, ProgramArithmetic.add(-2, -3));
    }

    @Test
    void subtractWorksWithPositiveAndNegativeNumbers() {
        assertEquals(7, ProgramArithmetic.subtract(12, 5));
        assertEquals(-2, ProgramArithmetic.subtract(3, 5));
    }

    @Test
    void multiplyWorksWithPositiveAndNegativeNumbers() {
        assertEquals(60, ProgramArithmetic.multiply(12, 5));
        assertEquals(-6, ProgramArithmetic.multiply(-2, 3));
        assertEquals(6, ProgramArithmetic.multiply(-2, -3));
    }

    @Test
    void multiplyByZeroGivesZero() {
        assertEquals(0, ProgramArithmetic.multiply(10, 0));
    }

    @Test
    void divideGivesFractionalResult() {
        assertEquals(2.4, ProgramArithmetic.divide(12, 5), DELTA);
        assertEquals(3.5, ProgramArithmetic.divide(7, 2), DELTA);
        assertEquals(0.25, ProgramArithmetic.divide(1, 4), DELTA);
    }

    @Test
    void divideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> ProgramArithmetic.divide(10, 0));
    }
}