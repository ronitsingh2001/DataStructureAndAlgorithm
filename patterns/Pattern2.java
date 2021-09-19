package patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--)
                System.out.print("*\t");
            System.out.println();
        }
    }
}
