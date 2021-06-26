package com.saurabh.projecteuler;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long largestPrimeFactor = findLargestPrimeFactor(n);
            System.out.println(largestPrimeFactor);
        }
    }

    private static long findLargestPrimeFactor(long n) {
        long answer = -1;
        long maxValue = (long) Math.sqrt(n);

        while (n % 2 == 0){
            n /= 2;
            answer = 2;
        }

        maxValue = (long) Math.sqrt(n);
        for (long factor = 3; factor <= maxValue; factor += 2){
            while (n % factor == 0){
                n /= factor;
                answer = factor;
            }

            maxValue = (long) Math.sqrt(n);
        }

        return Math.max(answer, n);
    }
}
