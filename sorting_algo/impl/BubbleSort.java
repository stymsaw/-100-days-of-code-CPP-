package com.company.sorting_algo.impl;


import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("hello world");

        int[] arr = {2, 5, 9, 1, 11, 6};
        doBubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static int[] doBubbleSort(int[] arr) {

        //     int[] arr = {2, 5, 9, 1, 11,  6};
        /*
        Round 1
        *   1st - {2, 5, 9, 1, 11, 6};
        *   2nd - {2, 5, 9, 1, 11, 6};
        *   3rd - {2, 5, 1, 9, 11, 6};
        *   4th - {2, 5, 1, 9, 11, 6};
        *   5th - {2, 5, 1, 9, 6, 11};
        Round 2
        *   1st - {2, 5, 1, 9, 6, 11};
        *   2nd - {2, 1, 5, 9, 6, 11};
        *   3rd - {2, 1, 5, 6, 9, 11};
        *   4th - {2, 1, 5, 6, 9, 11}; // if the no of swaps is zero, then we will be break as the array is already sorted now.
        Round 3
        *   1st - {2, 1, 5, 6, 9, 11};
        *   2nd - {1, 2, 5, 6, 9, 11};
        *   3rd -
        *   4th -  // if the no of swaps is zero, then we will be break as the array is already sorted now.

        * */

        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int count  = 0;

            for (int j = 0; j < length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                     swapItems(arr, j);
                     count++;
                }
            }
            if (count == 0)
                break;

        }

        return arr;


    }

    private static void swapItems(int[] arr, int position) {
        int temp = arr[position];
        arr[position] = arr[position + 1];
        arr[position + 1] = temp;
    }


}
