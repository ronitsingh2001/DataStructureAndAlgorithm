package patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n == 1) {
            System.out.println("*");
        } else if (n == 2) {
            System.out.println("*\n*");
        } else {
            int sp = n / 2;
            for (int i = 0; i < n / 2; i++) {
                System.out.print("\t");
            }
            System.out.println("*");
            for (int i = 1; i < n - 1; i++) {
                for (int j = 1; j < sp; j++)
                    System.out.print("\t");
                System.out.print("*");
                for (int j = 1; j < sp; j++)
                    System.out.print("\t");
                for (int j = 1; j < sp; j++)
                    System.out.print("\t");
                System.out.print("*");
                if (i >= (n / 2))
                    sp++;
                else
                    sp--;
                System.out.println();

            }
            for (int i = 0; i < n / 2; i++) {
                System.out.print("\t");
            }
            System.out.println("*");
        }

    }
}
