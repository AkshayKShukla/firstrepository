import java.util.*;
class MatRev
{
    int arr[][];
    int m,n;
    Scanner sc= new Scanner(System.in);
    MatRev(int mm,int nn)
    {
      m=mm;
      n=nn;
      arr=new int[m][n];
    }
    
    void fillarray()
    {
        System.out.println("enter your elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
    }
     int reverse(int x)
    {
        int y=0,s=0;
        while(x!=0)
        {
            y=x%10;
            s=(s*10)+y;//+(x%10);
            x/=10;
        }
        return s;
    }
    void revMat()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=reverse(arr[i][j]);
            }
        }
    }
    void show()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dimensions of your array");
        MatRev ob =new MatRev(sc.nextInt(),sc.nextInt());
        ob.fillarray();
        
        ob.revMat();
        
        ob.show();
    }
        
}