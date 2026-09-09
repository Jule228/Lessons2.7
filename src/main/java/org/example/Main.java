package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(ProgramFactorial.calculate(0));   // 1
        System.out.println(ProgramFactorial.calculate(5));   // 120
        System.out.println(ProgramFactorial.calculate(10));  // 3628800

        System.out.println(ProgramTriangle.areaByBaseAndHeight(10, 4));  // 20.0
        System.out.println(ProgramTriangle.areaByThreeSides(3, 4, 5));   // 6.0
        System.out.println(ProgramTriangle.isTriangle(1, 2, 10));        // false

        System.out.println(ProgramArithmetic.add(12, 5));       // 17
        System.out.println(ProgramArithmetic.subtract(12, 5));  // 7
        System.out.println(ProgramArithmetic.multiply(12, 5));  // 60
        System.out.println(ProgramArithmetic.divide(12, 5));    // 2.4

        System.out.println(ProgramComparison.compare(7, 3));      // 1
        System.out.println(ProgramComparison.compare(3, 7));      // -1
        System.out.println(ProgramComparison.compare(4, 4));      // 0
        System.out.println(ProgramComparison.isGreater(10, 2));   // true
        System.out.println(ProgramComparison.max(-1, -7));        // -1
        System.out.println(ProgramComparison.describe(7, 3));     // 7 > 3
    }
}