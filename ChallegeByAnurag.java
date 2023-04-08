import java.util.*;
class ChallegeByAnurag
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j=0,f=0;
        int ar[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
                
            }
        }
        for(i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
                
            }
            System.out.println();
        }
        
        System.out.println("After changing");
        
        for(i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                if(ar[i][j]==0)
                {
                f=1;
                break;
                }
                
            }
            if(f==1)
                break;
        }
        for(int k=0;k<n;k++)
        {
            
            
                ar[i][k]=0;
                ar[k][j]=0;
                
            
        }
        for(i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}