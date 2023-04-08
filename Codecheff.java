/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codecheff
{
    public String compare(String s1,String s2)
    {
        String s="";
        for(int i=0;(i<s1.length()&&i<s2.length());i++)
        {
            if(s1.charAt(i)==(s2.charAt(i)))
            s=s+"G";
            else
            s=s+"B";
        }
        return s;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        Codecheff ob=new Codecheff();
        int n=sc.nextInt();
        String x= sc.nextLine();
        String ar1[]=new String[n];
        String ar2[]=new String[n];
        String ar[]=new String[n];
        int t=0;
        for(int i=0;i<n;i++)
        {
            ar1[t]=sc.nextLine();
            ar2[t]=sc.nextLine();
            ar[t]=ob.compare(ar1[t],ar2[t]);
            t++;
        }
        for(int i=0;i<ar1.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
