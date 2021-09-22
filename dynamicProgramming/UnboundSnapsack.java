package dynamicProgramming;

import java.util.Scanner;

public class UnboundSnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] val = new int[n], weight = new int[n];
        for (int i = 0; i < n; i++)
            val[i] = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++)
            weight[i] = Integer.parseInt(sc.next());

        int cap = Integer.parseInt(sc.next());
        sc.close();

        int[] dp = new int[cap+1];
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<n;j++){
                int v= val[j], wt = weight[j];
                if(i>=wt){
                    dp[i]= dp[i]<dp[i-wt]+v?dp[i-wt]+v:dp[i];
                }
            }
        }
        System.out.println(dp[cap]);
    }
}
