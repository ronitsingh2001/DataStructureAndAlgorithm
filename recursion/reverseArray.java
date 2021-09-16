package recursion;

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        reverse(a, n - 1);
    }

    public static void reverse(int[] a, int n) {
        if (n == -1)
            return;
            System.out.println(a[n]);
            reverse(a, n - 1);
    }
}
