import java.util.*;
class Calendar2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day");
        int d=sc.nextInt();
        System.out.println("Enter the month");
        int m=sc.nextInt();
        System.out.println("Enter the year");
        int y=sc.nextInt();
        int lp[]={31,29,31,30,31,30,31,31,30,31,30,31};
        int nlp[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int sum=0;
        if((y>=1800)&&(y<=9999)&&(m<=12)&&(m>0))
        {
            if(y%4==0)
            {
                if(y%100==0&&y%400==0)
                {
                    for(int i=0;i<m-1;i++)
                    {
                        sum+=lp[i];
                    }
                }
                else if(y%100!=0)
                {
                    for(int i=0;i<m-1;i++)
                    {
                        sum+=lp[i];
                    }
                }
                else
                {
                    for(int i=0;i<m-1;i++)
                    {
                        sum+=nlp[i];
                    }
                }
            }
            else
            {
                if(d<=nlp[m-1])
                {
                   for(int i=0;i<m-1;i++)
                    {
                        sum+=nlp[i];
                    }
                }
                else
                {
                    System.out.println("The date is invalid");
                }
            }
            sum+=d;
            System.out.println("Number of days in current year "+sum);
        }
        else
        {
            System.out.println("The date is invalid");
        }
    }
}
