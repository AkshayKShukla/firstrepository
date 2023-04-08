import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class HR_Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex
{
    String num="((25[0-5])|(2[0-4][0-9])|(1[0-9][0-9])|(0?[0-9][0-9]?))";//1[0-9][0-9]|[0-9][0-9]?
        //String num="([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern=num+"."+num+"."+num+"."+num;
}