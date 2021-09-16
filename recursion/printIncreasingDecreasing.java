package recursion;


import java.util.*;

public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printDecreasingIncreasing(n);
    }

    public static void printDecreasingIncreasing(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printDecreasingIncreasing(n - 1);
        System.out.println(n);
    }
}
