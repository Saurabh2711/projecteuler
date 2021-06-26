package com.saurabh.projecteuler;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long diff = findSumSquareDiff(n);
            System.out.println(diff);
        }
    }

    private static long findSumSquareDiff(long n) {
        return ((n*n - 1)*n*(3*n + 2))/12;
    }
}
