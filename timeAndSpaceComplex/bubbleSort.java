package timeAndSpaceComplex;

import java.util.*;

public class BubbleSort {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    scn.close();

    bubbleSort(arr);

    print(arr);
  }

  public static void bubbleSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i; j++) {
        if (isSmaller(arr, j + 1, j) == true) {
          swap(arr, j + 1, j);
        }
      }
    }
  }

  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static boolean isSmaller(int[] arr, int i, int j) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
