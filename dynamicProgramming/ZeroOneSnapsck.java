package dynamicProgramming;

import java.util.Scanner;

public class ZeroOneSnapsck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] val = new int[n], weight = new int[n];
        for (int i = 0; i < val.length; i++)
            val[i] = Integer.parseInt(sc.next());

        for (int i = 0; i < weight.length; i++) {
            weight[i] = Integer.parseInt(sc.next());
        }
        int cap = sc.nextInt();
        sc.close();

        int[][] dp = new int[n + 1][cap + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = weight[i - 1]; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    int involved = dp[i - 1][j - weight[i - 1]] + val[i - 1];
                    if (involved > dp[i - 1][j]) {
                        dp[i][j] += involved;
                    } else {
                        dp[i][j] += dp[i - 1][j];
                    }
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}
