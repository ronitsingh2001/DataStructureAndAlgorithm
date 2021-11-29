package timeAndSpaceComplex;

import java.util.Scanner;

public class RadixSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) a[i] = sc.nextInt();

    sc.close();

    radixSort(a);

    for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
  }

  public static void radixSort(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] > max) max = a[i];
    }
    int pos = 1;
    while (pos <= max) {
      countSort(a, pos);
      pos *= 10;
    }
  }

  public static void countSort(int[] a, int pos) {
    int[] freq = new int[10];

    for (int i = 0; i < a.length; i++) freq[(a[i] / pos) % 10]++;

    for (int i = 1; i < 10; i++) freq[i] += freq[i - 1];

    int[] rv = new int[a.length];
    for (int i = a.length - 1; i >= 0; i--) {
      int ind = freq[(a[i] / pos) % 10] - 1;
      rv[ind] = a[i];
      freq[(a[i] / pos) % 10]--;
    }
    for (int i = 0; i < a.length; i++) a[i] = rv[i];
  }
}
