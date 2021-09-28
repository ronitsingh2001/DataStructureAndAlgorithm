package dynamicProgramming;

import java.util.Arrays;
// import java.util.Arrays;
import java.util.Scanner;

public class BuySellStock2Transaction {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] price = new int[n];
            for (int i = 0; i < n; i++)
                price[i] = sc.nextInt();
            sc.close();
            int lsf = price[0];
            int[] dp = new int[n];
            for (int i = 1; i < n; i++) {
                if (lsf > price[i]) {
                    lsf = price[i];
                    dp[i] = dp[i - 1];
                } else {
                    dp[i] = price[i] - lsf;
                    dp[i] = dp[i] > dp[i - 1] ? dp[i] : dp[i - 1];
                }
            }
            int[] sp = new int[n];
            int msf = price[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                if (price[i] > msf) {
                    msf = price[i];
                    sp[i] = sp[i + 1];
                } else {
                    sp[i] = msf - price[i];
                    sp[i] = sp[i] > sp[i + 1] ? sp[i] : sp[i + 1];
                }
            }
            for(int i=0;i<n;i++){
                dp[i]=dp[i]+sp[i];
            }
            Arrays.sort(dp);
            System.out.println(dp[n-1]);
    }
}
