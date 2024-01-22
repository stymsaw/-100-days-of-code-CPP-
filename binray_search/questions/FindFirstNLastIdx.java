package com.company.binray_search.questions;

public class FindFirstNLastIdx {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 8, 9};

        int target = 2;

        System.out.println(findFirstIndexOfElement(arr, target));

    }

    /*
    *
    *   8 2
        0 0 1 1 2 2 2 2
    *
    * */

    private static int findFirstIndexOfElement(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int ans = -1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target <= arr[mid]) {
                right = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }

}
