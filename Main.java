import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int X,Y,Z,xy,yz,zx;
        X=sc.nextInt();
        Y=sc.nextInt();
        Z=sc.nextInt();
        xy=X+Y;
        yz=Y+Z;
        zx=Z+X;
        if(xy%2==0&&xy>0)
        {
            System.out.println("YES");

        }
        else
        {
            if(yz%2==0&&yz>0)
            {
                System.out.println("YES");

            }
            else
            {
                if(zx%2==0&&zx>0)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }

    }
}