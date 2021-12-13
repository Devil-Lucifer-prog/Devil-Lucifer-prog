import java.util.*;
public class ISBN
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a code");
        String str=sc.nextLine();
        int len=str.length();
        String n="";
        int sum=0;
        for(int i=0,z=10;i<len;i++,z--)
        {
            char ch=str.charAt(i);
            n=""+ch;
            int k=Integer.parseInt(n);
            k*=z;
            sum+=k;
            n="";
        }
        if (len==9)
        sum+=10;
        if(sum%11==0)
        {
            System.out.println("Valid ISBN code");
        }
        else
        {
            System.out.println("Invalid ISBN code");
        }
    }
}