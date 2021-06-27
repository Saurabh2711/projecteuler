package com.saurabh.projecteuler;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int tripletMultiplication = findPythagoreanTripletMultiplication(n);
            System.out.println(tripletMultiplication);
        }
    }

    private static int findPythagoreanTripletMultiplication(int n) {
        int answer = -1;
        if (n % 2 != 0) {
            return answer;
        }

        for (int a = 1; a < n/3; ++a) {
            int c = (n*n + 2*a*a - 2*n*a)/(2*(n-a));
            int b = n - a - c;
            if ((a + b + c) == n && (a * a + b * b) == c * c) {
                answer = Math.max(answer, a * b * c);
            }
        }

        return answer;
    }
}
