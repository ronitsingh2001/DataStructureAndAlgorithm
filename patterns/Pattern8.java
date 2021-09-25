package patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            for(int i=n;i>0;i--){
                for(int j=1;j<=i;j++){
                    if(i==j)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
                n--;
                System.out.println();
            }
    }
}
