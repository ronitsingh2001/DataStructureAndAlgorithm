package timeAndSpaceComplex;

import java.util.Scanner;

public class CountSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      min = Math.min(min, a[i]);
      max = Math.max(max, a[i]);
    }
    sc.close();

    countSort(a, min, max);

    for (int i = 0; i < n; i++) System.out.println(a[i]);
  }

  public static void countSort(int[] a, int min, int max) {
    int range = max - min + 1;
    int[] freq = new int[range];

    for (int i = 0; i < a.length; i++) {
      int k = a[i] - min;
      freq[k]++;
    }
    for (int i = 1; i < range; i++) {
      freq[i] += freq[i - 1];
    }
    int[] res = new int[a.length];
    for (int i = a.length - 1; i >= 0; i--) {
      int k = a[i] - min;
      res[freq[k] - 1] = a[i];
      freq[k]--;
    }
    for (int i = 0; i < a.length; i++) {
      a[i] = res[i];
    }
  }
}
