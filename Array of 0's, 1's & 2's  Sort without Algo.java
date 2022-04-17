package com.company;

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
