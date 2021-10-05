package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaInHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sc.close();

        int[] rb = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        rb[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && a[i] <= a[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                rb[i] = a.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }

        int[] lb = new int[n];
        st = new Stack<>();
        st.push(0);
        lb[0]=-1;
        for(int i=1;i<n;i++){
            while (st.size() > 0 && a[i] <= a[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }

        long maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = width * a[i];
            if (area > maxArea)
                maxArea = area;
        }
        System.out.println(maxArea);
    }
}
