package com.saurabh.projecteuler;

import java.util.Scanner;

public class Problem11 {
    private static final int ROWS = 20;
    private static final int COLS = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; ++j) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxProduct = findMaxGridProduct(grid);
        System.out.println(maxProduct);

    }

    private static int findMaxGridProduct(int[][] grid) {
        int maxProduct = 0;
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                int diagonalDown = 1, diagonalUp = 1, down = 1, right = 1;
                for (int k = 0; k < 4; ++k) {
                    diagonalDown *= get(grid, row + k, col + k);
                    diagonalUp *= get(grid, row - k, col + k);
                    down *= get(grid, row + k, col);
                    right *= get(grid, row, col + k);
                }
                maxProduct = Math.max(maxProduct, diagonalDown);
                maxProduct = Math.max(maxProduct, diagonalUp);
                maxProduct = Math.max(maxProduct, down);
                maxProduct = Math.max(maxProduct, right);
            }
        }
        return maxProduct;
    }

    private static int get(int[][] grid, int row, int col) {
        if (row >= 0 & row < ROWS && col >= 0 && col < COLS) {
            return grid[row][col];
        }

        return 0;
    }
}
