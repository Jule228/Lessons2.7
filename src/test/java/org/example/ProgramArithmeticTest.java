package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProgramArithmeticTest {

    private static final double DELTA = 1e-9;

    @DataProvider(name = "addition")
    public Object[][] addition() {
        return new Object[][]{
                {12, 5, 17},
                {-2, 3, 1},
                {-2, -3, -5},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "multiplication")
    public Object[][] multiplication() {
        return new Object[][]{
                {12, 5, 60},
                {-2, 3, -6},
                {-2, -3, 6},
                {10, 0, 0}
        };
    }

    @DataProvider(name = "division")
    public Object[][] division() {
        return new Object[][]{
                {12, 5, 2.4},
                {7, 2, 3.5},
                {1, 4, 0.25}
        };
    }

    @Test(dataProvider = "addition", description = "Сложение")
    public void testAdd(int a, int b, int expected) {
        assertEquals(ProgramArithmetic.add(a, b), expected);
    }

    @Test(description = "Вычитание")
    public void testSubtract() {
        assertEquals(ProgramArithmetic.subtract(12, 5), 7);
        assertEquals(ProgramArithmetic.subtract(3, 5), -2);
    }

    @Test(dataProvider = "multiplication", description = "Умножение")
    public void testMultiply(int a, int b, int expected) {
        assertEquals(ProgramArithmetic.multiply(a, b), expected);
    }

    @Test(dataProvider = "division", description = "Деление даёт дробный результат")
    public void testDivide(int a, int b, double expected) {
        assertEquals(ProgramArithmetic.divide(a, b), expected, DELTA);
    }

    @Test(expectedExceptions = ArithmeticException.class,
            expectedExceptionsMessageRegExp = "Деление на ноль",
            description = "Деление на ноль вызывает ArithmeticException")
    public void testDivisionByZero() {
        ProgramArithmetic.divide(10, 0);
    }
}