package timeAndSpaceComplex;

import java.util.*;

public class PartionAnArray {

  public static void partition(int[] a, int pivot) {
    // write your code here
    int i = 0, j = 0;
    while (i < a.length) {
      if (a[i] > pivot) {
        i++;
      } else {
        swap(a, i, j);
        i++;
        j++;
      }
    }

  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    scn.close();
    int pivot = scn.nextInt();
    partition(arr, pivot);
    print(arr);
  }

}
