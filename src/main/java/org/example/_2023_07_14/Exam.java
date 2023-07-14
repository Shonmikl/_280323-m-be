package org.example._2023_07_14;

import java.util.Arrays;

public class Exam {
    //[1 1 5 3 3]
    // 0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 1
    //** 0 0 0 0 0 0 0 1

    // 0 0 0 0 0 0 0 1
    // 0 0 0 0 0 0 0 1
    //**0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 1
    // 0 0 0 0 0 1 0 1
    // 0 0 0 0 0 0 1 1
    // 0 0 0 0 0 0 1 1
    private static int searchUniqueDigitEx1(int[] array) {
        int x = 0;
        for (int i : array) {
            x = (x ^ i);
        }
        return x;
    }

    private static int searchUniqueDigitEx2(int[] array) {
        return Arrays.stream(array).reduce(0, (a, b) -> a ^ b);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9};
        int[] arrUnsorted = {9, 5, 1, 3, 6, 8, 25, 9, 5, 1, 3, 6, 8};

//        System.out.println(searchUniqueDigitEx1(arr));
//        System.out.println(searchUniqueDigitEx2(arrUnsorted));
//        System.out.println(55 ^ 5);

        //0000 1000
        //0000 0111
        //0000 1111
        System.out.println(8 ^ 7);

        int w = 0b00001000;
        int r = 0b00000111;

        int x = 0xF7F;
        int q = 0x96A;

        System.out.println(x & q);
    }
}