import java.util.*;
class Shorten_Your_Name
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name");
        String name=sc.nextLine();
        int index=name.lastIndexOf(" ");
        int len=name.length();
        String str="";
        for(int i=0;i<index;i++)
        {
            char ch=name.charAt(i);
            if(Character.isUpperCase(ch)==true)
            {
                str+=ch;
                str+=" ";
            }
        }
        str+=name.substring(index+1,len);
        str=str.replace(" ",".");
        System.out.println("Name: "+str);
    }
}
