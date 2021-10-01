package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (st.size() == 0 || st.peek() != '(') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else if (s.charAt(i) == '}') {
                if (st.size() == 0 || st.peek() != '{') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else if (s.charAt(i) == ']') {
                if (st.size() == 0 || st.peek() != '[') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            }
        }
        if (st.size() != 0) {
            System.out.println(false);
        } else
            System.out.println(true);
    }
}
