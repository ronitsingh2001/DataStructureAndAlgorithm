package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class Celebrity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                a[j][k] = sc.nextInt();
            }
        }
        sc.close();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
            st.push(i);
        while(st.size()>1){
            int v1=st.pop();
            int v2=st.pop();
            if(a[v1][v2]==1){
                st.push(v2);
            }else{
                st.push(v1);
            }
        }
        int pot=st.pop();
        for(int i=0;i<n&&i!=pot;i++){
            if(a[pot][i]==1||a[i][pot]==0){
                System.out.println("none");
                return;
            }
        }
        System.out.println(pot);
    }
}
