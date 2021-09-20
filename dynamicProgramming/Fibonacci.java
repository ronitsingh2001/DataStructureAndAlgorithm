package dynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(fibonacci(n, new int[n + 1]));
    }

    public static int fibonacci(int n, int[] qb) {
        if (n == 0 || n == 1)
            return n;
        if (qb[n] != 0)
            return qb[n];
        int fnm1=fibonacci(n-1,qb);
        int fnm2=fibonacci(n-2,qb);
        int fbn=fnm1+fnm2;

        qb[n]=fbn;
        return fbn;
    }
}
