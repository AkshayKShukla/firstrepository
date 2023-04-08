import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static int check(String s)
    {
        String temp="";
        s=s.trim();
        s=s+" ";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                temp=temp+c;
            }
            else
            {
                if((temp.equals("end-of-file"))||temp.equals("end-of-file."))
                {
                    return 0;
                }
                else
                {
                    temp="";
                }
            }
        }   
        return 1;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t=1;
        String test="",finall="";
        int max=1;
        while(t==1&&max<=1000)
        {
            test=sc.nextLine();
            t=check(test);
            finall=finall+test+"*";
            test="";
            max++;
        }
        int count=1;
        String s2="";
        for(int i=0;i<finall.length();i++)
        {
            char c=finall.charAt(i);
            if(c!='*')
            {
                s2=s2+c;
            }
            else
            {
                System.out.println(count +" "+s2);
                s2="";
                count++;
            }
        }
    }
    
}
