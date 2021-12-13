import java.util.*;
class Calendar1
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
        int leap_year[]={31,29,31,30,31,30,31,31,30,31,30,31};
        int not_alp[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if((y>=1800)&&(y<=9999)&&(m<=12)&&(m>0))
        {
            if(y%4==0)
            {
                if(y%100==0&&y%400==0)
                {
                    if(d<=leap_year[m-1])
                    {
                        System.out.println("The date is verfied");
                    }
                }
                else if(y%100!=0)
                {
                    System.out.println("The date is verfied");
                }
                else
                {
                    if(d<=not_alp[m-1])
                {
                    System.out.println("The date is verfied");
                }
                else
                {
                    System.out.println("The date is invalid");
                }
                }
            }
            else
            {
                if(d<=not_alp[m-1])
                {
                    System.out.println("The date is verfied");
                }
                else
                {
                    System.out.println("The date is invalid");
                }
            }
        }
        else
        {
            System.out.println("The date is invalid");
        }
    }
}