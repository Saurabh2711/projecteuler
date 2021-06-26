package com.saurabh.projecteuler;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int largestPalindrome = findPalindrome(n);
            System.out.println(largestPalindrome);
        }
    }

    private static int findPalindrome(int n) {
        int answer = -1;
        for (int a = 999; a >= 100; a--){
            for (int b = 999; b >= a; b--){
                if (a*b < n && isPalindrome(a*b)){
                    answer = Math.max(answer, a*b);
                }
            }
        }

        return answer;
    }

    private static boolean isPalindrome(int n) {
        int reverse = reverse(n);

        return n == reverse;
    }

    private static int reverse(int n){
        int reverse = 0;
        while (n>0){
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }

        return reverse;
    }
}
