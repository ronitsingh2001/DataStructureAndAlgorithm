package dynamicProgramming;

import java.util.Scanner;

public class BuySellStockKTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int[][] dp = new int[k + 1][n];
        for (int i = 1; i < dp.length; i++) {
            int max = dp[i][0] - price[0];
            for (int j = 1; j < n; j++) {
                if (j > 1) {
                    max = Math.max(max, dp[i - 1][j - 1] - price[j - 1]);
                }
                if (max + price[j] > dp[i][j - 1]) {
                    dp[i][j] = max + price[j];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(dp[i][j] + "\t");
            System.out.println();
        }
    }
}
