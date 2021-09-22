package dynamicProgramming;

import java.util.Scanner;

public class CoinChangePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        int amt = sc.nextInt();
        sc.close();
        
        int[] dp = new int[amt + 1];
        dp[0] = 1;
        for(int i=1;i<=amt;i++){
            for(int j=0;j<a.length;j++){
                if(a[j] <= i){
                    dp[i]+=dp[i-a[j]];
                }
            }
        }
        System.out.println(dp[amt]);
    }
}
