package recursion.recursionOnWayUp;

import java.util.Scanner;

public class PrintKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        printKPC(s, "");

    }

    static String[] code = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch1 = ques.charAt(0);
        String roq = ques.substring(1);
        String codesForNum = code[Integer.parseInt(String.valueOf(ch1))];
        for (int i = 0; i < codesForNum.length(); i++) {
            String charForCode = codesForNum.substring(i, i + 1);
            printKPC(roq, ans + charForCode);
        }
    }
}
