import java.util.*;
class Digit_Sum_Recursion
{
    public int digit_sum(int n)
    {
        if(n!=0)
        {
            return n%10+digit_sum(n/10);
        }
        else
        {
            return 0;
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        Digit_Sum_Recursion obj=new Digit_Sum_Recursion();
        System.out.println("Sum of the digits of the number is: "+obj.digit_sum(n));
    }
}