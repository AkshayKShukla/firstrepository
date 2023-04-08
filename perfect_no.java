import java.util.*;
class perfect_no
{
    public static void main ()
    {
        int sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter no to check");
     int num=sc.nextInt();
     for(int i=1;i<num;i++)
     {
         if(num%i==0)
         {
             sum=i+sum;
             System.out.println(i);
            }
        }
             
        
        System.out.println("sum of factors"+sum);
            
          
        
             if(num==sum)
             {
                 System.out.println("number is perfect number");
             }
             else
             {
                 System.out.println("no is not a perfect no ");
             }
         
     
    }
}