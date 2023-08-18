package org.example._2023_08_18;

/**
 * 0 1 1 2 3 5 8 13 21 34 55 89.......n
 */

public class Fib {
    public static long fib(int fibIndex) {
        if (fibIndex < 0) {
            throw new IllegalArgumentException();
        }

        var fib1 = -1L;
        var fib2 = 1L;

        for (int i = 0; i <= fibIndex; i++) {
            var current = fib1 + fib2;
            fib1 = fib2;
            fib2 = current;
        }
        return fib2;
    }

    public static long fibRec(int fibIndex) {
        if (fibIndex < 0) {
            throw new IllegalArgumentException();
        }
        if (fibIndex == 0) {
            return 0;
        }
        return fibIndex == 1 || fibIndex == 2 ? 1L : fibRec(fibIndex - 2) + fibRec(fibIndex - 1);
    }

    public static void main(String[] args) {
        int index = 48;
        long fibTime = System.currentTimeMillis();
        fib(index);
        System.out.println("FIB: " + (System.currentTimeMillis() - fibTime));

        long fibRecTime = System.currentTimeMillis();
        fibRec(index);
        System.out.println("FIB REC: " + (System.currentTimeMillis() - fibRecTime));
    }
}