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
            if (s.charAt(i) == ')') {
                while (st.peek() != '('){
                    st.pop();
                    if(st.peek()=='{'||st.peek()==']'){
                        System.out.println(false);
                        return;
                    }
                }
                st.pop();
            } else if (s.charAt(i) == '}') {
                while (st.peek() != '{'){
                    st.pop();
                    if(st.peek()==']'){
                        System.out.println(false);
                    }
                }
                st.pop();
            } else if (s.charAt(i) == ']') {
                while (st.peek() != '[')
                    st.pop();
                st.pop();
            }
            if (s.charAt(i) != ')' && s.charAt(i) != '}' && s.charAt(i) != ']') {
                st.push(s.charAt(i));
            }
        }
        System.out.println(true);
    }
}
