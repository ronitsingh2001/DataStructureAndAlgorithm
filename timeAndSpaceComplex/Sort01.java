package timeAndSpaceComplex;

import java.util.Scanner;

public class Sort01 {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    scn.close();

    sort01(arr);

    print(arr);
  }

  public static void sort01(int[] arr) {
    for (int i = 0, j = 0; i < arr.length;) {
      if (arr[i] == 1) {
        i++;
      } else {
        swap(arr, i, j);
        i++;
        j++;
      }
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
