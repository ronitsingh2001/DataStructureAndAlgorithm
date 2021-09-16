package recursion.recursionInArrayList;
import java.util.*;
public class getSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        ArrayList<String> res= getSubsequence(s);
        System.out.println(res);
    }
    public static ArrayList<String> getSubsequence(String s){
        if(s.length()==0){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        char s0=s.charAt(s.length()-1);
        String sN=s.substring(0,s.length()-1);
        ArrayList<String> recRes=getSubsequence(sN);
        ArrayList<String> myRes=new ArrayList<>();
        for(String val:recRes){
            myRes.add(val);
            myRes.add(val+s0);
        }
        return myRes;
    }
}
