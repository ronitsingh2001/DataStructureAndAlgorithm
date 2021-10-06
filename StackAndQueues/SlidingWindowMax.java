package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int[] ans = new int[n - k];
        Stack<Integer> st = new Stack<>();
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < k; i++) {
            if (max < a[n - i])
                max = a[n - i];
        }
        st.push(max);
        for (int i = n - k -1; i >= 0; i--) {
            if (st.peek() < a[i]) {
                st.pop();
                st.push(a[i]);
                ans[i] = st.peek();
            } else {
                ans[i] = st.peek();
            }
        }
        for (int i = 0; i < n-k; i++)
            System.out.print(ans[i]+" ");
    }
}
