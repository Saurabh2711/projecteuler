package com.saurabh.projecteuler;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long smallestMultiple = lcmFirstN(n);
            System.out.println(smallestMultiple);
        }
    }

    private static long lcmFirstN(int n) {
        long lcmValue = 1;
        for (int i = 1; i <= n; i++){
            lcmValue = lcm(lcmValue, i);
        }

        return lcmValue;
    }

    private static long lcm(long a, long b){
        return (a*b)/gcd(a, b);
    }

    private static long gcd(long a, long b) {
        if (a == 0){
            return b;
        }

        return gcd(b % a, a);
    }
}
