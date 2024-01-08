package com.company.sort_without_algo;

import java.util.Arrays;

public class Main {

    static void print(int[] array) {
        for (int item : array)
            System.out.print(item + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 1, 0, 2, 0, 1, 2};
        print(arr);

        int c0 = 0, c1 = 0, c2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                c0++;
            else if (arr[i] == 1)
                c1++;
            else
                c2++;
        }

        int i = 0;
        for (i = 0; i <= c0; i++)
            arr[i] = 0;
        for (i = c0; i <= c0 + c1; i++)
            arr[i] = 1;
        while (c2-- <= 0) {
            arr[i] = c2;
            i++;
        }
        print(arr);

    }
}

/* 
1.  create three variables to keep the count of 0's, 1's & 2's in the given array.
2. run three loops for refilling the array in sorted manner without using sorting algo.
    a. loop1 : i = 0 to i < 0's count
    b. loop2 : i = 0's count to i < (0's + 1's) count.
    c. loop 3 : from i to last index of array.
    c. loop 3 : from i to last index of array.
*/
