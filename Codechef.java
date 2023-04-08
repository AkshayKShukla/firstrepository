/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
            String finall="";
            Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of cases: ");
        int cases=sc.nextInt(),t=0;
        String s1="",s2="";
        for(int i=0;i<cases;i++)
        {
            System.out.println("Enter your Actual word");
            if(t==0)
            {
                String in=sc.nextLine().toUpperCase();
                t=1;
            }
            String inp=sc.nextLine().toUpperCase();
            System.out.println("Enter your guessed Word");
            String gu=sc.nextLine().toUpperCase();
            String check="";
            int c1=inp.length(),c2=gu.length();
            s1=inp;
            s2=gu;
            if(c1==c2)
            {
                 for(int j=0;j<inp.length();j++)
                 {
                    if(inp.charAt(j)==(gu.charAt(j)))
                    {
                      check=check+"G";
                    }
                    else
                    {
                      check=check+"B";
                    }
                 }
            
                finall=finall+check+'*';
                check="";
            }
            else 
            {
                System.out.println("Length of words isn't same !!!");
            }
            
        }
        String prt="";
        for(int i=0;i<finall.length();i++)
        {
            if(finall.charAt(i)!='*')
            {
                prt=prt+finall.charAt(i);
            }
            else
            {
                System.out.println(prt);
                prt="";
            }
            
        }
        
    }
}
