package patterns;

import java.util.Scanner;

public class BuySellStockWCooldown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();
        sc.close();
        int obsp = -price[0], ossp = 0, ocsp = 0;
        for (int i = 1; i < n; i++) {
            int nbsp = 0, nssp = 0, ncsp = 0;

            if (obsp > ocsp - price[i])
                nbsp = obsp;
            else
                nbsp = ocsp - price[i];

            if (ossp > obsp + price[i])
                nssp = ossp;
            else
                nssp = obsp + price[i];

            if (ocsp > ossp)
                ncsp = ocsp;
            else
                ncsp = ossp;

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        System.out.println(ossp);
    }
}
