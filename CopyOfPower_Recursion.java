import java.util.*;
class CopyOfPower_Recursion
{
   public int Power(int a,int b)
   {
       if(b==0)
       {
         return 1;
       }
       else
       {
           return a*Power(a,b-1);
       }
   }
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base and power");
        int a=sc.nextInt();
        int b=sc.nextInt();
        CopyOfPower_Recursion obj=new CopyOfPower_Recursion();
        System.out.println(obj.Power(a,b));
   }
}
