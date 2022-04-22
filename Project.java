import java.util.*;
class Project
{
    String str;
    public Project()
    {
        str="";
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please choose your option from the following");
        System.out.println("1. Encrypt text entered");
        System.out.println("2.Decrypt text entered");
        System.out.println("3.Exit");
        System.out.println("Please enter your choice as 1 or 2 or 3");
        int ch=sc.nextInt();
        sc.nextLine();
        Encryptor obj=new Encryptor();
        Decryptor ob=new Decryptor();
        if(ch==3)
        {
            System.out.println("Thank you, the program has been terminated");
            System.exit(0);
        }
        else if(ch==1)
        {
            System.out.println("Please enter the text to be encrypted");
            str=sc.nextLine();
            str=str.toUpperCase();
            obj.encrypt(str);
        }
        else if(ch==2)
        {
            System.out.println("Please enter the text to be decrypted");
            str=sc.nextLine();
            ob.decrypt(str);
        }
        else
        {
            System.out.println("Invalid Input, Program has been terminated");
        }
    }
    public static void main()
    {
        System.out.println("Welcome");
        Project obj=new Project();
        obj.input();
    }
}