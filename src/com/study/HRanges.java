package com.study;

import java.util.Arrays;

public class HRanges {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16, 18};
        calculate(arr.length, arr);
    }

    public static void calculate(int length, int[] arr) {

        int minInRange = arr[0];
        int maxInRange = 0;

        for (int i = 0; i < length; i++) {
            if ((maxInRange + 1) == arr[i]) {
                maxInRange++;
            } else {
                output(minInRange, maxInRange);
                maxInRange = arr[i];
                minInRange = arr[i];
            }
        }
        output(minInRange, maxInRange);
    }

    public static void output(int minInRange, int maxInRange) {
        if (minInRange == maxInRange) {
            System.out.println("[" + maxInRange + "]");
        } else {
            System.out.println("[" + minInRange + " " + maxInRange + "]");
        }
    }
}
