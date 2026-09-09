package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ProgramTriangleTest {

    private static final double DELTA = 1e-9;

    @DataProvider(name = "baseAndHeight")
    public Object[][] baseAndHeight() {
        return new Object[][]{
                {10.0, 4.0, 20.0},
                {3.0, 2.0, 3.0},
                {1.0, 1.0, 0.5}
        };
    }

    @DataProvider(name = "threeSides")
    public Object[][] threeSides() {
        return new Object[][]{
                {3.0, 4.0, 5.0, 6.0},
                {6.0, 8.0, 10.0, 24.0},
                {5.0, 5.0, 6.0, 12.0}
        };
    }

    @DataProvider(name = "invalidSides")
    public Object[][] invalidSides() {
        return new Object[][]{
                {1.0, 2.0, 10.0},
                {1.0, 1.0, 2.0},
                {0.0, 4.0, 5.0}
        };
    }

    @Test(dataProvider = "baseAndHeight", description = "Площадь по основанию и высоте")
    public void testAreaByBaseAndHeight(double base, double height, double expected) {
        assertEquals(ProgramTriangle.areaByBaseAndHeight(base, height), expected, DELTA);
    }

    @Test(dataProvider = "threeSides", description = "Площадь по формуле Герона")
    public void testAreaByThreeSides(double a, double b, double c, double expected) {
        assertEquals(ProgramTriangle.areaByThreeSides(a, b, c), expected, DELTA);
    }

    @Test(dataProvider = "invalidSides",
            expectedExceptions = IllegalArgumentException.class,
            description = "Некорректные стороны вызывают исключение")
    public void testInvalidSides(double a, double b, double c) {
        ProgramTriangle.areaByThreeSides(a, b, c);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            description = "Нулевое основание вызывает исключение")
    public void testZeroBase() {
        ProgramTriangle.areaByBaseAndHeight(0, 5);
    }

    @Test(description = "isTriangle различает корректные и некорректные стороны")
    public void testIsTriangle() {
        assertTrue(ProgramTriangle.isTriangle(3, 4, 5));
        assertFalse(ProgramTriangle.isTriangle(1, 2, 10));
        assertFalse(ProgramTriangle.isTriangle(-1, 2, 3));
    }
}