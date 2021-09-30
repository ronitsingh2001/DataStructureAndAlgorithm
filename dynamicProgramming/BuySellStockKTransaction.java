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
        for (int i = 1; i <= k; i++) {
            int max = dp[i - 1][0];
            for (int j = 1; j < n; j++) {
                max = Math.max(max, dp[i - 1][j] - price[j-1]);
                if(max+price[j]>dp[i-1][0]){
                    dp[i][j]=max+price[j];
                }else{
                    dp[i][j]=dp[i-1][j-1];
                }
            }
            System.out.println(dp[k][n-1]);
        }
    }
}
