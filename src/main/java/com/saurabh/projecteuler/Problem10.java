package com.saurabh.projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        List<Integer> primes = generatePrimeTillN(1000001);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long primeSum = findPrimeSum(primes, n);
            System.out.println(primeSum);
        }
    }

    private static List<Integer> generatePrimeTillN(int n){
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        int upperLimit = (int) Math.sqrt(n);
        for (int i = 2; i <= upperLimit; ++i){
            if (isPrime[i]){
                for (int multiple = i*i; multiple < n; multiple += i){
                    isPrime[multiple] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; ++i){
            if (isPrime[i]){
                primes.add(i);
            }
        }

        return primes;
    }

    private static long findPrimeSum(List<Integer> primes, int n) {
        long sum = 0;
        for (Integer prime : primes){
            if (prime > n){
                break;
            }

            sum += prime;
        }

        return sum;
    }
}
