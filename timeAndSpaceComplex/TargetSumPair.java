package timeAndSpaceComplex;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int tar = sc.nextInt();
        sc.close();
        targetSumPair(a, tar);
    }

    public static void targetSumPair(int[] a, int tar) {
        Arrays.sort(a);
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] + a[j] == tar) {
                System.out.println(a[i] + ", " + a[j]);
                i++;
                j--;
            } else if (a[i] + a[j] > tar) {
                j--;
            } else {
                i++;
            }
        }
    }
}
