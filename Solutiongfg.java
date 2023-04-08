import java.util.*;
class Solutiongfg {
    static int minRepeats(String A, String B) 
    {
        String tocopy=A,finB=B;
        int la=A.length(),lb=B.length(),counter=1,found=0;
        String temp;
        while(la<lb)
        {
            A=A+tocopy;
            la=A.length();
            lb=B.length();
            counter++;
        }
        char c=B.charAt(0);
        int start=A.indexOf(B);;
        while(start==-1&&(A.length()<=2*B.length()))
        {
            A=A+tocopy;
            counter++;
            start=A.indexOf(B);
        }
        
        
        if(start==-1) return -1;
        else
        return counter;
        
        // code here
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(minRepeats(sc.nextLine(),sc.nextLine()));
    }
}