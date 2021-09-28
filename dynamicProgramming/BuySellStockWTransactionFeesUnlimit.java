package dynamicProgramming;

import java.util.Scanner;

public class BuySellStockWTransactionFeesUnlimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();
        int fee = sc.nextInt();
        sc.close();
        int obsp = -price[0], ossp = 0;
        for (int i = 1; i < n; i++) {
            int nbsp = 0;
            int nssp = 0;
            if (obsp > ossp - price[i]) {
                nbsp = obsp;
            } else {
                nbsp = ossp - price[i];
            }
            obsp=nbsp;
            if (ossp > obsp - fee + price[i]) {
                nssp = ossp;
            } else {
                nssp = obsp - fee + price[i];
            }
            ossp=nssp;
        }
        System.out.println(ossp);
    }
}
