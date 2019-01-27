package com.study;

import java.util.Arrays;

public class Ranges {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16, 18};
        findRanges(arr.length, arr);
    }

    public static void findRanges(int length, int[] arr) {
        int minInRange = arr[0];
        int maxInRange = 0;

        for (int i = 0; i < length; i++) {
            if ((maxInRange + 1) == arr[i]) {
                maxInRange++;
            } else {
                printRanges(minInRange, maxInRange);
                maxInRange = arr[i];
                minInRange = arr[i];
            }
        }
        printRanges (minInRange, maxInRange);
    }

    private static void printRanges(int minInRange, int maxInRange) {
        if (minInRange == maxInRange) {
            System.out.println("[" + maxInRange + "]");
        } else {
            System.out.println("[" + minInRange + " " + maxInRange + "]");
        }
    }
}
