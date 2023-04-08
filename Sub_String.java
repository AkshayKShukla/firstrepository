import java.util.Scanner;

public class Sub_String
 {

  
    public static String getSmallestAndLargest(String s, int k)
    {
        String smallest = "";
        String largest = "";
        
        s=s.trim();
        
        int l=s.length();
        int count=0;

        String St[]=new String[(l-k+1)];
        int len=St.length;
        for(int i=0;(i+k)<=l;i++)
        {
            
            St[count++]=s.substring(i,i+k);
        
        }
        for(int i=0;i<St.length-1;i++)
        {
            String check=St[i];
            check=check.toLowerCase();
            for(int j=i+1;j<St.length;j++)
            {
                String check2=St[j];
                check2=check2.toLowerCase();
                for(int m=0;m<k;m++)
                {
                    if(check.charAt(m)==check2.charAt(m))
                    {
                        continue;
                    }
                    else
                    {
                        if(check.charAt(m)>check2.charAt(m))
                        {
                            String swap=St[i];
                            St[i]=St[j];
                            St[j]=swap;
                            check=St[i];
                            check2=St[j];
                            break;
                        }
                        else
                        break;
                    }
                }
            }
            
        }
        smallest=St[0];
        largest=St[len-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}