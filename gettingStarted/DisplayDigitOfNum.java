package gettingStarted;

import java.util.Scanner;

public class DisplayDigitOfNum {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        display(n);
    }

    public static void display(int n) {
        if (n == 0) return;
        display(n / 10);
        System.out.println(n % 10);
        n = n / 10;
    }
}
