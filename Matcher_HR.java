import java.util.Scanner;
import java.util.regex.*;

public class Matcher_HR
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		String fake = in.nextLine();
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
              try
              {
                  
                  Pattern pat=Pattern.compile(pattern);
                  System.out.println("Valid");
                  Matcher mat=pat.matcher("XYZ");
              }
              catch(Exception e)
              {
                  System.out.println("Invalid");
              }
              testCases--;
		}
	}
}



