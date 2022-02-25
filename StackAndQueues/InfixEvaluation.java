package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    Stack<Integer> operands = new Stack<>();
    Stack<Character> operator = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(') {
        operator.push(ch);
      } else if (Character.isDigit(ch)) {
        operands.push(ch - '0');
      } else if (ch == ')') {
        while (operator.peek() != '(') {
          char op = operator.pop();
          int v2 = operands.pop();
          int v1 = operands.pop();
          operands.push(evaluate(v1, v2, op));
        }
        operator.pop();
      } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
        while (
          operator.size() > 0 &&
          operator.peek() != '(' &&
          precedence(ch) <= precedence(operator.peek())
        ) {
          char op = operator.pop();
          int v2 = operands.pop();
          int v1 = operands.pop();
          operands.push(evaluate(v1, v2, op));
        }
        operator.push(ch);
      }
    }
    while (operator.size() != 0) {
      char op = operator.pop();
      int v2 = operands.pop();
      int v1 = operands.pop();
      operands.push(evaluate(v1, v2, op));
    }
    System.out.println(operands.pop());
  }

  public static int precedence(char op) {
    if (op == '+') {
      return 1;
    } else if (op == '-') {
      return 1;
    } else if (op == '*') {
      return 2;
    } else {
      return 2;
    }
  }

  public static int evaluate(int v1, int v2, char op) {
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
