package com.saurabh.projecteuler;

import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> primes = findFirstNPrimes(1000001);
        while (t-- > 0){
            int n = sc.nextInt();
            int prime = primes.get(n-1);
            System.out.println(prime);
        }
    }

    private static List<Integer> findFirstNPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        List<Integer> primes = new ArrayList<>();
        int upperLimit = (int) Math.sqrt(n);
        for (int number = 2; number <= upperLimit; ++number) {
            if (isPrime[number]) {
                for (int i = number * number; i < n; i += number) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i < n; ++i) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
