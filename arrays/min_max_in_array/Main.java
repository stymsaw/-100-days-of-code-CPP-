package com.company.arrays.min_max_in_array;

public class Main {

    static int maX(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            max = max > array[i] ? max : array[i];
        return max;
    }
    static int miN(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
            min = min < array[i] ? min : array[i];
        return min;
    }

    static void print(int[] array) {
        for (int item : array){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 7, 3, -4, 5};
        print(arr);
        System.out.println(maX(arr));
        System.out.println(miN(arr));
    }
}
