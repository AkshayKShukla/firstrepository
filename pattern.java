import java.util.*;
class pattern
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("input");
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        
            
        
        if((n>3&&n<10)&&(n==m))
        {
            char a[][]=new char[n][n];
            System.out.println("enter first character");
            char first=sc.next().charAt(0);
            System.out.println("enter second char");
            char second=sc.next().charAt(0);
            System.out.println("enter third character");
            char third=sc.next().charAt(0);
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                  if((i==0||i==n-1)&&(j==n-1||j==0))
                  
                     a[i][j]=first; 
                     else if((i>0&&i<n-1)&&(j>0&&j<n-1))
                     a[i][j]=third;
                     else
                     a[i][j]=second;
                     
                  
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                   System.out.println(a[i][j]+"  ");
                }
                                   

            } 
            System.out.println();

                
        
    }
    
        else
        {
            System.out.print("enter valid square matrix");
        }
   }
}