package com.saurabh.projecteuler;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long sumOfEvenFib = sumOfEvenFibsLessThanN(n);
            System.out.println(sumOfEvenFib);
        }
    }

    private static long sumOfEvenFibsLessThanN(long n) {
        long fibPrevious = 1;
        long fib = 1;

        long sum = 0;

        while (fib < n){
            if (fib % 2 == 0){
                sum += fib;
            }

            long fibNext = fibPrevious + fib;
            fibPrevious = fib;
            fib = fibNext;
        }

        return sum;
    }
}
