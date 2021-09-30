package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ')') {
                st.push(s.charAt(i));
            } else {
                if (st.peek() == '(') {
                    System.out.println(true);
                    return;
                } else {
                    while (st.peek() != '(')
                        st.pop();
                    st.pop();
                }
            }
            System.out.println(st + " ");

        }
        System.out.println(false);
    }
}
