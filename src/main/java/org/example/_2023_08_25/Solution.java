package org.example._2023_08_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  0 1 2 3 4 5 6 7 8 9 (4)  -->
class Solution {
    public static void rotate(int[][] matrix) {
        int M = matrix.length;

        for (int i = 0; i < M; i++) {
            for (int j = i; j < M; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < (M / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][M - 1 - j];
                matrix[i][M - 1 - j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public void rotate1(int[][] matrix) {
        List<Integer> integerList
                = new ArrayList<>(matrix.length * matrix.length);

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                integerList.add(ints[j]);
            }
        }

        int count = 0;
        int j = 0;

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int k = count; k < matrix.length + count; k++) {
                matrix[j][i] = integerList.get(k);
                j++;
            }
            j = 0;
            count += matrix.length;
        }
    }
    // a & b
    // 0b11111110 ----
    // 0b11111101 ----
    // 0b11111100
    private static int oneCounter(int a) {
        int result = 0; // 1 1

        while (a != 0) {
            a = a & (a - 1); // a  = 254 & (254-1)
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        //rotate(arr);

        int a = 255; // 11111111
        int ab = 0b11111111;
        int ah = 0x777;
        System.out.println(oneCounter(a));
    }
}