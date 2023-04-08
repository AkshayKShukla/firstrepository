import java.io.*;
import java.util.*;

public class Lexicogra {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine().toLowerCase();
        String B=sc.nextLine().toLowerCase();
        int CombLeng=A.length()+B.length();
        boolean check=false;
        System.out.println(CombLeng);
        if(A.length()<B.length())
        check=true;
        for(int i=0;i<A.length()&&i<B.length();)
        {
            if(A.charAt(i)<B.charAt(i))
            {
                check=true;
                break;
            }
            else
            {
                if(A.charAt(i)>B.charAt(i))
                {
                    
                    check=false;
                    break;
                }
                else
                i++;
            }
        }
        if(check)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        String A1=A.substring(1);
        String B1=B.substring(1);
        A=A.toUpperCase();
        B=B.toUpperCase();
        A1=A.charAt(0)+A1;
        B1=B.charAt(0)+B1;
        System.out.println(A1+" "+B1);
        
    }
}



