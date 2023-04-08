import java.util.*;
class potential
{
    int poten(String s)
    {
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            p=p+(int)s.charAt(i);
        }
        return p;
    }
    public void main ()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter your sentence");
        String a=Sc.nextLine();
        int word=0;
        char m=a.charAt(a.length()-1);
        if((m=='!')||(m=='?')||(m=='.'))
        {
            
            for(int i=0;i<a.length();i++)
            {
                 if((a.charAt(i)=='!')||(a.charAt(i)=='?')||(a.charAt(i)=='.')||(a.charAt(i)==' '))
                 {
                     word+=1;
                 }
            }
            String ar[]=new String[word];
            int arr[]=new int[word];
            String words="";
            int t=0;
            for(int i=0;i<a.length();i++)
            {
                if((a.charAt(i)=='!')||(a.charAt(i)=='?')||(a.charAt(i)=='.')||(a.charAt(i)==' '))
                {
                    
                    ar[t]=words;
                    arr[t]=poten(words);
                    words="";
                    t++;
                }
                else
                {
                    words=words+a.charAt(i);
                }
            }
            for(int i=0;i<arr.length-1;i++)
            {
                
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        
                        String tempo;
                        tempo=ar[i];
                        ar[i]=ar[j];
                        ar[j]=tempo;
                    }
                }
                    
                
            }
            for(int i=0;i<ar.length;i++)
            {
                
                    System.out.println(ar[i]+"="+arr[i]);
                    
                
            }
        }
        else
        {
            System.out.println("invalid");
        }
    }
}