package dynamicProgramming;

import java.util.Scanner;

public class PaintHouseManyColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[n][c];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++)
                a[i][j] = Integer.parseInt(sc.next());
        }
        sc.close();
        int[][] dp = new int[n][c];
        for (int i = 0; i < c; i++) {
            dp[0][i] = a[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < c; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < c; k++) {
                    if (j != k) {
                        if (min > dp[i-1][k])
                            min = dp[i-1][k];
                    }
                }
                dp[i][j] = a[i][j] + min;
            }
        }
       
        int cost = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            if (dp[n-1][i] < cost)
                cost = dp[n-1][i];
        }
        System.out.println(cost);
    }
}
