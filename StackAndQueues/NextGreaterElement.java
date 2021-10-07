package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sc.close();
        Stack<Integer> st = new Stack<>();
        st.push(a[n - 1]);
        int[] ans = new int[n];
        ans[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && a[i] >= st.peek()) {
                st.pop();
            }
            if (st.size() > 0) {
                ans[i] = st.peek();
            } else {
                ans[i] = -1;
            }
            st.push(a[i]);
        }
        for (int i = 0; i < n; i++)
            System.out.println(ans[i]);
    }
}
