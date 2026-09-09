package org.example;

public class ProgramFactorial {

    public static long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определён для отрицательных чисел: " + n);
        }
        if (n > 20) {
            throw new ArithmeticException("Переполнение long: факториал " + n + " слишком велик");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}