package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProgramComparisonTest {

    @Test
    void compareReturnsOneWhenFirstIsGreater() {
        assertEquals(1, ProgramComparison.compare(7, 3));
        assertEquals(1, ProgramComparison.compare(-3, -5));
    }

    @Test
    void compareReturnsMinusOneWhenFirstIsLess() {
        assertEquals(-1, ProgramComparison.compare(3, 7));
        assertEquals(-1, ProgramComparison.compare(-5, -3));
    }

    @Test
    void compareReturnsZeroWhenNumbersAreEqual() {
        assertEquals(0, ProgramComparison.compare(4, 4));
        assertEquals(0, ProgramComparison.compare(0, 0));
    }

    @Test
    void equalNumbersAreNeitherGreaterNorLess() {
        assertTrue(ProgramComparison.isEqual(7, 7));
        assertFalse(ProgramComparison.isGreater(7, 7));
        assertFalse(ProgramComparison.isLess(7, 7));
    }

    @Test
    void greaterAndLessWorkCorrectly() {
        assertTrue(ProgramComparison.isGreater(10, 2));
        assertTrue(ProgramComparison.isLess(-10, 2));
        assertFalse(ProgramComparison.isGreater(-10, 2));
    }

    @Test
    void maxAndMinWorkWithNegativeNumbers() {
        assertEquals(5, ProgramComparison.max(5, 3));
        assertEquals(3, ProgramComparison.min(5, 3));
        assertEquals(-1, ProgramComparison.max(-1, -7));
        assertEquals(-7, ProgramComparison.min(-1, -7));
    }

    @Test
    void describeReturnsReadableString() {
        assertEquals("7 > 3", ProgramComparison.describe(7, 3));
        assertEquals("3 < 7", ProgramComparison.describe(3, 7));
        assertEquals("4 == 4", ProgramComparison.describe(4, 4));
    }
}