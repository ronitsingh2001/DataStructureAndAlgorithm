package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class SmallestNumberFollowingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int num =1;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='d'){
                st.push(num);
                num++;
            }else{
                st.push(num);
                num++;
                while(st.size()>0){
                    System.out.print(st.pop());
                }
            }
        }
        st.push(num);
        while(st.size()>0)
            System.out.print(st.pop());
    }
}
