import java.util.*;
class differenceOfDays
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int Days[]={31,28,31,30,31,30,31,31,30,31,30,31};
       
        int date1 =6;
        int month1=8;
        int year1=2017;
        int days=0; 
        
        String Day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        int swapped=0;
        int date2=sc.nextInt();
        int month2=sc.nextInt();
        int year2=sc.nextInt();
            
        if(year2<year1)
        {
            int swapd =date1;
            date1=date2;
            date2=swapd;
            
            int swapm=month1;
            month1=month2;
            month2=swapm;
            
            int swapy=year1;
            year1=year2;
            year2=swapy;
            swapped=1;
        }
        else
        {
            if((month2<month1)&&(year2==year1))
            {
                int swapd =date1;
                date1=date2;
                date2=swapd;
            
                int swapm=month1;
                month1=month2;
                month2=swapm;
            
                int swapy=year1;
                year1=year2;
                year2=swapy;
                swapped=1;
            }
            else
            {
                 if((month1==month2)&&(year1==year2)&&(date2<date1))
                 {
                     int swapd =date1;
                     date1=date2;
                     date2=swapd;
            
                     int swapm=month1;
                     month1=month2;
                     month2=swapm;
            
                     int swapy=year1;
                     year1=year2;
                     year2=swapy;
                     swapped=1;
                 }
            }
        }
        int dycr=date1,mncr=month1,yrcr=year1;
        while(dycr!=date2)
        {
            if(yrcr%4==0)Days[1]=29;
            else Days[1]=28;
            if(dycr==Days[month1-1])
            {
                dycr=0;
                mncr++;
            }
            dycr++;
            days++;
            if(dycr>Days[month1-1])break;
        }
        while(mncr!=month2)
        {
            
            if(mncr==13)
            {
                mncr=1;
                yrcr++;
                if(yrcr%4==0)
                days+=1;
            }
            days=days+Days[mncr-1];
            mncr++;
        }
        while(yrcr!=year2)
        {
            if(year2-yrcr>4)
            {
                days=days+(((year2-yrcr)/4)*1461);
                yrcr=yrcr+((year2-yrcr)/4)*4;
            }
            if((yrcr+1)%4==0)
            {
                days=days+366;
            }
            else
            {
                days=days+365;
            }
            yrcr++;
        }
        System.out.println(days);
        
        if(swapped==0)
        System.out.println (Day[days%7]);
        else
        System.out.println (Day[7-days%7]);
    }    
}