import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Triangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,r,sp,st;
        n=sc.nextInt();
        // n1=2*n-1;
        for(r=1;r<=n;r++){
            for(sp=1;sp<=n-r;sp++)
                System.out.print(" ");
            for(st=1;st<=2*r-1;st++)
                System.out.print("*");
             System.out.println();
        }
       
    }
}
