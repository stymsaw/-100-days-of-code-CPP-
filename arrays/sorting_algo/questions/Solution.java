package com.company.arrays.sorting_algo.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(
                List.of(0, 0, 1, 1, 2, 2, 2, 2)
        );
        System.out.println(Arrays.toString(firstAndLastPosition(arr, 2)));
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int k) {
        // Write your code here.

        int count = 0;
        for (Integer integer : arr)
            if (integer == k)
                count++;

        int first = findFirstIndex(arr, k);

        return new int[]{first, first + count};

    }

    public static int findFirstIndex(ArrayList<Integer> arr, int n) {

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == n)
                return i;
        }

        return -1;

    }

}
