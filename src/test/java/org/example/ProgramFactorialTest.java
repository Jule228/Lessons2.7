package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ProgramFactorialTest {

    @DataProvider(name = "factorials")
    public Object[][] factorials() {
        return new Object[][]{
                {0, 1L},
                {1, 1L},
                {5, 120L},
                {10, 3628800L},
                {20, 2432902008176640000L}
        };
    }

    @Test(dataProvider = "factorials", description = "Факториал считается верно")
    public void testCalculate(int n, long expected) {
        assertEquals(ProgramFactorial.calculate(n), expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            description = "Отрицательный аргумент вызывает IllegalArgumentException")
    public void testNegativeArgument() {
        ProgramFactorial.calculate(-1);
    }

    @Test(description = "Аргумент больше 20 вызывает ArithmeticException")
    public void testOverflow() {
        assertThrows(ArithmeticException.class, () -> ProgramFactorial.calculate(21));
    }
}