import java.util.*;
class Factor_Recursion
{
   static int n;
   
    public void display(int i)
    {
        if(i<=n)
        {
            if(n%i==0)
            System.out.println(i);
            display(i+1);
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        Factor_Recursion obj=new Factor_Recursion();
        int i=1;
        obj.display(i);
    }
}
