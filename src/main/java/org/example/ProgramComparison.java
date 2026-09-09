package org.example;

public class ProgramComparison {

    public static int compare(int a, int b) {
        if (a < b) {
            return -1;
        }
        if (a > b) {
            return 1;
        }
        return 0;
    }

    public static boolean isEqual(int a, int b) {
        return a == b;
    }

    public static boolean isGreater(int a, int b) {
        return a > b;
    }

    public static boolean isLess(int a, int b) {
        return a < b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    public static String describe(int a, int b) {
        int result = compare(a, b);
        String sign = result == 0 ? "==" : (result > 0 ? ">" : "<");
        return a + " " + sign + " " + b;
    }
}
