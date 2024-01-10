package com.company.sorting_algo.impl;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 3, 11, 7, 5, 9};

        doInsertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void doInsertionSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
    }

}
