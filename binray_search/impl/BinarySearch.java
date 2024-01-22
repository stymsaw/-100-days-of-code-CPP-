package com.company.binray_search.impl;


public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 8, 9, 12, 44, 66};

        int target = 8;

        int idx = binarySearchImpl(arr, target);

        System.out.println(idx);


    }

    private static int binarySearchImpl(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
        int mid = left + (right - left) / 2;
            if (arr[mid] > target)
                left = mid + 1;
            else if (arr[mid] < target)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }

}
