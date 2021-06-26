package com.saurabh.projecteuler;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long sumOfMultiples = findSumOfMultipleOf3And5(n);
            System.out.println(sumOfMultiples);
        }
    }

    private static long findSumOfMultipleOf3And5(int n) {
        long sum3Div = 3 * sumOfNaturalNumbers((n-1)/3);
        long sum5Div = 5 * sumOfNaturalNumbers((n - 1)/5);
        long sum15Div = 15 * sumOfNaturalNumbers((n - 1)/15);

        return sum3Div + sum5Div - sum15Div;
    }

    private static long sumOfNaturalNumbers(long n) {
        return (n * (n + 1))/2;
    }
}
