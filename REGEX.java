import java.util.regex.*;
import java.util.Scanner;
class REGEX
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        try{
        Pattern pat=Pattern.compile("[AZ[a-z](a-z)");
        String IP=in.nextLine();
        Matcher mat=pat.matcher(IP);
        //System.out.println(mat.matches());
        //System.out.println(mat.lookingAt());
        //System.out.println("FIND"+mat.find());
        System.out.println("Valid");
        }
        catch(Exception e)
        {
            System.out.println("Invaid");
        }
    }
}