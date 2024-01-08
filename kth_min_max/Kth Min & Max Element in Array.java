package com.company.kth_min_max;

import java.util.Arrays;

public class Main {

    static int maxKth(int[] array, int index) {
        int[] localArray = array;
        Arrays.sort(localArray);
        System.out.println("\n" + "Sorted Array");
        print(localArray);  // Print local array after sorting (asc. order)
        System.out.print(index + "th Max Element: ");
        return localArray[localArray.length - index];
    }

    static int minKth(int[] array, int index) {
        int[] localArray = array;
        System.out.println("\n" + "Sorted Array");
        Arrays.sort(localArray);
        print(localArray);  // Print local array after sorting (asc. order)
        System.out.print(index + "th Min Element: ");
        return localArray[index - 1];
    }

    static void print(int[] array) {
        for (int item : array)
            System.out.print(item + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 7, 9};
        System.out.println("Input Array");
        print(arr);

        System.out.println(maxKth(arr, 3));
        System.out.println(minKth(arr, 3));


    }
}
