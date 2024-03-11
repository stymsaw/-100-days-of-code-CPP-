package com.company.arrays.sorting_algo.impl;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {2, 5, 9, 1, 11, 6};
        doSelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void doSelectionSort(int[] arr) {

        int len = arr.length;

        // store the index of min item
        // swap it with the first index of current unsorted array
        for (int i = 0; i < len; i++) {
            int minIdx = idxOfMinElement(arr, i);
            swap(arr, i, minIdx);
        }

    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    private static int idxOfMinElement(int[] arr, int startIdx) {
        int min_item = arr[startIdx];
        int min_idx = startIdx;
        int len = arr.length;
        for (int i = startIdx; i < len; i++) {
            if (arr[i] < min_item) {
                min_item = arr[i];
                min_idx = i;
            }
        }
        return min_idx;
    }


}
