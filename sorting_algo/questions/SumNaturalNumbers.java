package com.company.sorting_algo.questions;

public class SumNaturalNumbers {

    public static void main(String[] args) {

        int n = 10;

        int sum = sumNaturalNumbers(n);
        System.out.println(sum);

    }

    private static int sumNaturalNumbers(int n) {
        if (n < 1)
            return n;
        return n + sumNaturalNumbers(n - 1);
    }


}
