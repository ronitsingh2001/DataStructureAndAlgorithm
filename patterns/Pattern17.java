package patterns;

import java.util.*;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int st = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (i != n / 2)
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }
            for (int j = 0; j < st; j++)
                System.out.print("*\t");
            System.out.println();
            if (i < n / 2)
                st++;
            else
                st--;
        }
    }
}
