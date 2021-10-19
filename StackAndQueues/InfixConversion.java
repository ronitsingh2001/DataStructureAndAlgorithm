package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class InfixConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> oper = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                oper.push(ch);  
            } else if (Character.isLetter(ch)) {
                pre.push(ch + "");
                post.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (oper.size() > 0 && precedence(ch) <= precedence(oper.peek()) && oper.peek() != '(') {
                    char op = oper.pop();
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    pre.push(op + v1 + v2);
                    v2 = post.pop();
                    v1 = post.pop();
                    post.push(v1 + v2 + op);
                }
                oper.push(ch);
            } else if (ch == ')') {
                while (oper.peek() != '(') {
                    char op = oper.pop();
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    pre.push(op + v1 + v2);
                    v2 = post.pop();
                    v1 = post.pop();
                    post.push(v1 + v2 + op);
                }
                oper.pop();
            }
        }
        while (oper.size() > 0) {
            char op = oper.pop();
            String v2 = pre.pop();
            String v1 = pre.pop();
            pre.push(op + v1 + v2);
            v2 = post.pop();
            v1 = post.pop();
            post.push(v1 + v2 + op);
        }
        System.out.println(post.pop());
        System.out.println(pre.pop());
    }

    public static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else
            return 2;
    }
}
