import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutionn 
{
    static Scanner sc=new Scanner(System.in);
    
    static int B=sc.nextInt(),H=sc.nextInt();
    public static boolean check()
    {
        if((B<=100)&&(B>=0)&&(H<=100)&&(H>=0))
        {
            return true;
        }
        else
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return false;
        }
    }
    static boolean flag=check();
    public static void main(String[] args)
    {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
    }//end of main

}//end of class

