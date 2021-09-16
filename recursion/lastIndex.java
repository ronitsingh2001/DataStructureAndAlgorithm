package recursion;

import java.util.*;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int x = sc.nextInt();
        sc.close();    


        System.out.println(firstIndex(a,n-1,x));
    }

    public static int firstIndex(int[] a, int n, int x) {
        if (n == -1)
            return -1;
        if (a[n] == x)
            return n;
        int li = firstIndex(a, n - 1, x);
        return li;
    }
}
