import java.util.*;
class Adder
{
    int a[]=new int[2];
    Scanner Sc=new Scanner (System.in);

Adder()
{
   a[0]=0;
   a[1]=0;
}
void readtime()
{
    System.out.println("enter hours");
    a[0]=Sc.nextInt();
    System.out.println("enter mintues");
    a[1]=Sc.nextInt();
}
void addtime(Adder X,Adder Y)
{
    a[1]=X.a[1]+Y.a[1];
    if (a[1]>=60)
    {
       a[0]=a[1]/60;
       a[1]=a[1]%60;
    }
    a[0]= a[0]+X.a[0]+Y.a[0];
    
    
}
void display()
{
    System.out.println("sum is:"+a[0]+" "+a[1]);
}
public static void main (String args[])
{
Adder obj1=new Adder();
Adder obj2=new Adder();
Adder obj3=new Adder();
obj1.readtime();
obj2.readtime();
obj3.addtime(obj1,obj2);
obj3.display();
}
}








    
