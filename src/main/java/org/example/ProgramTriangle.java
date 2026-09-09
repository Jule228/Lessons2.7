package org.example;

public class ProgramTriangle {

    public static double areaByBaseAndHeight(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основание и высота должны быть положительными");
        }
        return 0.5 * base * height;
    }

    public static boolean isTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        return a + b > c && a + c > b && b + c > a;
    }

    public static double areaByThreeSides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Все стороны должны быть положительными");
        }
        if (!isTriangle(a, b, c)) {
            throw new IllegalArgumentException("Треугольник со сторонами " + a + ", " + b + ", " + c + " не существует");
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}