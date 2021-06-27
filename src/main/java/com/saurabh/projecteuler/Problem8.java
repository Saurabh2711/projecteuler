package com.saurabh.projecteuler;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String digits = sc.next();
            long maxProduct = findMaxProduct(digits, n, k);
            System.out.println(maxProduct);
        }
    }

    private static long findMaxProduct(String digits, int n, int k) {
        long maxProduct = -1;

        for (int i = 0; i < n - k; ++i){
            long consecutiveProduct = findProductOfFirstKElement(digits, i, k);
            maxProduct = Math.max(maxProduct, consecutiveProduct);
        }

        return maxProduct;
    }

    private static long findProductOfFirstKElement(String digits, int startIndex, int k) {
        long product = 1;
        for (int i = startIndex; i < k + startIndex; ++i){
            product *= Integer.parseInt(String.valueOf(digits.charAt(i)));
        }

        return product;
    }
}
