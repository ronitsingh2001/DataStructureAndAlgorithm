package recursion.recursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class getKPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> res = getKPC(s);
        System.out.println(res);
        sc.close();
    }

    static String[] code = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String s) {
        if (s.length() == 0) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }
        char ch = s.charAt(0);
        String res = s.substring(1);
        ArrayList<String> recRes = getKPC(res);
        ArrayList<String> myRes = new ArrayList<>();
        int codeInNum = Integer.parseInt(String.valueOf(ch));
        String charForCode = code[codeInNum];
        for (int i = 0; i < charForCode.length(); i++)
            for (String str : recRes) {
                myRes.add(charForCode.charAt(i) + str);
            }
        return myRes;
    }
}
