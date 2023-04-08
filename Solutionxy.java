import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Resultxy {

    /*
     * Complete the 'countMaximumOperations' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     */

    public static int countMaximumOperations(String s, String t) {
        
        int count=0,ls=s.length(),lt=t.length(),c=0;
    // Write your code here
    String str[]=new String[lt];
    for(int i=0;i<lt;i++)
    {
        str[i]=t.charAt(i)+"";
    }
    int freq[]=new int[lt];
    
    
    for(int i=0;i<lt;i++)
    {
        String ch=str[i];
        
        for(int j=0;j<ls;j++)
        {
            String ch2=s.charAt(j)+"";
            if(ch2.equals(ch))
            freq[i]+=1;
        }
    }
    
    
    for(int i=0;i<lt;i++)
    {
        System.out.println(freq[i]+" ");
    }
    return count;

    }

}

public class Solutionxy {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int result = Result.countMaximumOperations(s, t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
