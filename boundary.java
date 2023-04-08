import java.util.*;
class boundary
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of ararry");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        int sum=0;
        System.out.println("enter array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!(i==0||j==0||i==m-1||j==n-1)){
                     sum=sum+arr[i][j];
                     
                    
                }
              
                
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
        
                System.out.print(arr[i] [j]+"       ");
            }
              System.out.print("");
        }
            System.out.println("sum"+" "+sum);
              
        
        
        
        
    }
}