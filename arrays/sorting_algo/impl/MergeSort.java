package com.company.arrays.sorting_algo.impl;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 3, 11, 7, 5, 9};

        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));


    }

    static void merge(int[] arr, int start, int mid, int end) {

        int len1 = mid - start + 1;
        int len2 = end - mid;


        int[] firstHalf = new int[len1];
        int[] secondHalf = new int[len2];

//        copy data in both arrays

        for (int i = 0; i < len1; i++)
            firstHalf[i] = arr[start + i];

        for (int i = 0; i < len1; i++)
            secondHalf[i] = arr[mid + 1 + i];

//        compare and fill the main array

        int i = 0, j = 0;
        int k = start;
        while (i < len1 && j < len2) {
            if (firstHalf[i] < secondHalf[j]) {
                arr[k] = firstHalf[i];
                i++;
            } else {
                arr[k] = secondHalf[j];
                j++;
            }
            k++;
        }

//        fill left out elements

        while (i < len1) {
            arr[k] = firstHalf[i];
            i++;
            k++;
        }

        while (j < len2) {
            arr[k] = secondHalf[j];
            j++;
            k++;
        }


    }

    static void sort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }

    }


}
