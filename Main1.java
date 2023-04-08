import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main1 {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        while(x!=0)
        {
            int n=sc.nextInt();
            int blocks=n*2;
            System.out.println(permu(blocks,2));;
            x--;
        }
    }
    public static int permu(int x,int y)
    {
        int prod=1,prod2=1,copy=y;
        for(int i=x;copy>0;copy--)
        {
            prod=prod*i--;
        }
        for(int i=y;i>=1;i--)
        {
            prod2=prod2*i;
        }
        return((prod*2)/prod2);
    }
}
