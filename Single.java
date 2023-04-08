import java.util.*;
class Single
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine()+" ";
        String word="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                word=word+s.charAt(i);
            }
            else
            {
                System.out.println(word);
                word="";
            }
        }
    }
}