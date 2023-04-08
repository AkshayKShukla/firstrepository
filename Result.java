import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result
 {
     
     public static String findDay(int month, int day, int year)
     {
        //String Day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        //int Days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        //if(year%4==0)
        //{
         //   Days[1]=29;
        //}
        //int fyear=2017,fmonth=8,fday=13;
        System.out.println(day+month+year);
        return "TESTING";
     }
     public static void main()
     {
         Scanner sc= new Scanner(System.in);
         String in=sc.nextLine().trim()+" ";String add="";
         int arr[]=new int[3]; int t=0;
         for(int i=0;i<in.length();i++)
         {
            if(in.charAt(i)!=' ')
            {
                add=add+in.charAt(i);
            }
            else
            {
                arr[t++]=Integer.parseInt(add);
                add="";
                
            }
         }
         String Day=findDay(arr[0],arr[1],arr[2]);
         System.out.println(Day);
     }

}