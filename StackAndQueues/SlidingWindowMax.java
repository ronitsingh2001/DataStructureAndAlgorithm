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
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(nge.length - 1);
        nge[n - 1] = nge.length;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && a[i] >= a[st.peek()]) {
                st.pop();
            }
            if (st.size() > 0) {
                nge[i] = st.peek();
            } else {
                nge[i] = nge.length;
            }
            st.push(i);
        }
        for (int i = 0; i <= n - k; i++) {
            int j = i;
            while (nge[j] < i + k) {
                j = nge[j];
            }
            System.out.println(a[j]);
        }
    }

}
