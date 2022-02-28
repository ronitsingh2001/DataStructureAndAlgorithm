package patterns;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            int icj=1;
            for(int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                icj=(icj*(i-j))/(j+1);
            }
            System.out.println();
        }
    }   
}
