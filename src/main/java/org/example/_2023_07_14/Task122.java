package org.example._2023_07_14;

public class Task122 {
    private static int bitCounter(int n) {//11---1011
        int result = 0;
        while (n != 0) { //8 --- 1 0 0 0
            n = n & (n - 1); //n = 8 & 7
            /**
             * 1 0 0 0
             * 0 1 1 1
             * 0 0 0 0
             */
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 11; // 0b00001011
        System.out.println(Integer.toBinaryString(a));
        System.out.println(bitCounter(a));
        System.out.println(Integer.toBinaryString(10 & 9));
    }
}