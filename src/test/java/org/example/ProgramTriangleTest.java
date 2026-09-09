package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProgramTriangleTest {

    private static final double DELTA = 1e-9;

    @Test
    void areaByBaseAndHeightIsCorrect() {
        assertEquals(20.0, ProgramTriangle.areaByBaseAndHeight(10, 4), DELTA);
    }

    @Test
    void areaByThreeSidesIsCorrect() {
        assertEquals(6.0, ProgramTriangle.areaByThreeSides(3, 4, 5), DELTA);
    }

    @Test
    void bothFormulasGiveSameResult() {
        assertEquals(6.0, ProgramTriangle.areaByBaseAndHeight(3, 4), DELTA);
        assertEquals(6.0, ProgramTriangle.areaByThreeSides(3, 4, 5), DELTA);
    }

    @Test
    void isTriangleDetectsValidAndInvalidSides() {
        assertTrue(ProgramTriangle.isTriangle(3, 4, 5));
        assertFalse(ProgramTriangle.isTriangle(1, 2, 10));
        assertFalse(ProgramTriangle.isTriangle(-1, 2, 3));
    }

    @Test
    void zeroBaseThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> ProgramTriangle.areaByBaseAndHeight(0, 5));
    }

    @Test
    void nonExistingTriangleThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> ProgramTriangle.areaByThreeSides(1, 2, 10));
    }
}