package recursion;

import java.util.*;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sc.close();

        System.out.println(maxOfArray(a, n - 1));
    }

    public static int maxOfArray(int[] a, int i) {
        if (i == -1)
            return 0;
        int misa = maxOfArray(a, i - 1);
        if (misa < a[i])
            return a[i];
        else {
            return misa;
        }
    }
}
