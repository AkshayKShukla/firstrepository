
import java.util.*;
public class delivery
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int x,counter=0,rounds=0;
        System.out.println("Enter number of packages");
        x=sc.nextInt();
        int ar[]=new int[x];
        System.out.println("Enter packages");
        for(int i=0;i<x;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<x-1;i++)
        {
            int comp=ar[i];
            for(int j=i+1;j<x;j++)
            {
                if(comp==ar[j]&&comp!=-1)
                {
                    counter++;
                    if(counter==1)
                    rounds++;
                    if(counter>3)
                    {
                        counter=0;
                        j--;
                    }
                    else
                    {
                    ar[j]=-1;
                    ar[i]=-1;
                    }
                }
            }
            counter=0;
            
        }
        int check=0;
        for(int i=0;i<x;i++)
        {
            if(ar[i]!=-1)
            
            {
                check=1;
                System.out.println(-1);
                break;
                
            }
        }
        if(check!=1)
        System.out.println("Rounds "+rounds);
    }
}