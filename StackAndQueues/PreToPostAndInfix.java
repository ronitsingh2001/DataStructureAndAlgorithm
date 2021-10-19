package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class PreToPostAndInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        Stack<String> pre = new Stack<>();
        Stack<Integer> eval = new Stack<>();
        Stack<String> in = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.println("outt");
                in.push(ch + "");
                pre.push(ch + "");
                eval.push(ch - '0');
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                System.out.println("innn");
                String v2 = in.pop();
                String v1 = in.pop();
                in.push('(' + v2 + ch + v1 + ')');
                v2 = pre.pop();
                v1 = pre.pop();
                pre.push(v2 + v1 + ch);
                int o2 = eval.pop();
                int o1 = eval.pop();
                eval.push(evaluation(o2, o1, ch));
            }
        }
        System.out.println(eval.pop());
        System.out.println(in.pop());
        System.out.println(pre.pop());
    }

    public static int evaluation(int v1, int v2, char op) {
        if (op == '+') {
            return v1 + v2;
        } else if (op == '-') {
            return v1 - v2;
        } else if (op == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
