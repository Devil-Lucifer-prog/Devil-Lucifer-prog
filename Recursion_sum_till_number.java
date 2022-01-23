import java.util.*;
class Recursion_sum_till_number
{
    
    public int display(int n)
    {
        if(n>=1)
        {
           return n+display(n-1);
        }
        else
        return 0;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        Recursion_sum_till_number obj=new Recursion_sum_till_number();
        System.out.println(obj.display(n));
    }
}