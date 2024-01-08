package com.company.reverse_array;

public class Main {

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    static void print(int[] array) {
        for (int item : array){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5};
        print(arr);
        int j = 0;
        int k = arr.length - 1;
        while (j < k) {
            swap(arr, arr[j], arr[k]);
            j++;
            k--;
        }
        print(arr);

    }
}
