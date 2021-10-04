package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;


public class LargestAreaInHistogram {
    public static void main(String[] args) {
         Scanner sc = new Scanner( System.in);
         int n = sc.nextInt();
         int[] a = new int[n];
         for(int i=0;i<n;i++)
            a[i]= sc.nextInt();
        sc.close();

        int[] rb =new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        rb[n-1]=n;
        for(int i=0;i<n;i++){
        }
        
        int[] lb =new int[n];


        long maxArea =0;
        for(int i=0;i<n;i++){
            int width = rb[i]-lb[i]-1;
            int area = width*a[i];
            if(area> maxArea)
                maxArea=area;
        }
        System.out.println(maxArea);
    }
}
