import java.util.*;
class evil_no
{
    String tobinarry(int a)
    {
         String b="";
    while(a<0)
        
        {
            a=a/2;
            int remen=a%2;
           
             b=remen+b;
            
        }
        return b;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. to check");
        int a=sc.nextInt();
        if(a>2 && a<100)
        {
           String bin=obj.tobinarry(a);
           System.out.println("binary no."+bin);
           int count=0;
           for(int i=0;i<bin.length();i++)
           {
               if (bin.charAt(i)=='1')
               {
                   count++;
                   if(count/2==0)
                   {
                       System.out.println("the given no. is evil");
                    
                    
                   }
                   else
                   {
                       System.out.println("given no. is not evil");
                   }
               }
               
               }
               
           }
        
        else
        {
            System.out.println("no. out of range");
        }
    }
}