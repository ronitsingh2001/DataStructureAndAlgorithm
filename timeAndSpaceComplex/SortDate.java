package timeAndSpaceComplex;

import java.util.Scanner;

public class SortDate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            a[i] = str;
        }
        scn.close();

        sortDates(a);

        print(a);
    }

    public static void sortDates(String[] a) {
        countSort(a, 1000000, 100, 32);
        countSort(a, 10000, 100, 13);
        countSort(a, 1, 10000, 2501);
    }

    public static void countSort(String[] a, int div, int mod, int range) {
        int[] freq = new int[range];
        for (int i = 0; i < a.length; i++)
            freq[Integer.parseInt(a[i], 10) / div % mod]++;

        for (int i = 1; i < freq.length; i++)
            freq[i] += freq[i - 1];

        String[] ans = new String[a.length];

        for (int i = a.length-1; i >=0; i--) {
            int pos = freq[Integer.parseInt(a[i], 10) / div % mod] - 1;
            ans[pos] = a[i];
            freq[Integer.parseInt(a[i], 10) / div % mod]--;
        }

        for (int i = 0; i < a.length; i++)
            a[i] = ans[i];
    }

    public static void print(String[] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
