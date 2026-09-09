package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ProgramComparisonTest {

    @DataProvider(name = "comparisons")
    public Object[][] comparisons() {
        return new Object[][]{
                {7, 3, 1},
                {3, 7, -1},
                {4, 4, 0},
                {-3, -5, 1},
                {-5, -3, -1}
        };
    }

    @DataProvider(name = "maxMin")
    public Object[][] maxMin() {
        return new Object[][]{
                {5, 3, 5, 3},
                {3, 5, 5, 3},
                {4, 4, 4, 4},
                {-1, -7, -1, -7}
        };
    }

    @Test(dataProvider = "comparisons", description = "compare возвращает -1, 0 или 1")
    public void testCompare(int a, int b, int expected) {
        assertEquals(ProgramComparison.compare(a, b), expected);
    }

    @Test(description = "Равные числа не больше и не меньше друг друга")
    public void testEqualNumbers() {
        assertTrue(ProgramComparison.isEqual(7, 7));
        assertFalse(ProgramComparison.isGreater(7, 7));
        assertFalse(ProgramComparison.isLess(7, 7));
    }

    @Test(description = "isGreater и isLess работают верно")
    public void testGreaterAndLess() {
        assertTrue(ProgramComparison.isGreater(10, 2));
        assertTrue(ProgramComparison.isLess(-10, 2));
        assertFalse(ProgramComparison.isGreater(-10, 2));
    }

    @Test(dataProvider = "maxMin", description = "max и min, включая отрицательные числа")
    public void testMaxAndMin(int a, int b, int expectedMax, int expectedMin) {
        assertEquals(ProgramComparison.max(a, b), expectedMax);
        assertEquals(ProgramComparison.min(a, b), expectedMin);
    }

    @Test(description = "describe возвращает читаемую строку")
    public void testDescribe() {
        assertEquals(ProgramComparison.describe(7, 3), "7 > 3");
        assertEquals(ProgramComparison.describe(3, 7), "3 < 7");
        assertEquals(ProgramComparison.describe(4, 4), "4 == 4");
    }
}