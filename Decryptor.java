import java.util.*;
class Decryptor
{
public void decrypt(String str)
    {
        String letter="";
        String decrypted="";
        String digit="";
        int l=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!='?')
            {
                letter+=ch;
            }
            else
            {
                int sum=0;
                for(int j=letter.length()-1;j>=0;j--)
                {
                    char c=letter.charAt(j);
                    if(Character.isLetter(c)==true)
                    {
                        int dif=((c-'A')+10)*(int)Math.pow(16,l);
                        sum+=(dif);
                        l++;
                    }
                    if(Character.isDigit(c)==true)
                    {
                        digit+=c;
                        int k=Integer.parseInt(digit);
                        k*=(int)Math.pow(16,l);
                        sum+=(k);
                        digit="";
                        l++;
                    }
                }
                int m=sum;
                int rev=0;
                while(m!=0)
                {
                    int d=m%10;
                    rev=(rev*10)+d;
                    m/=10;
                }
                sum=rev;
                if((sum*10>=65&&sum*10<=90)||(sum*10>=97&&sum*10<=122))
                    sum*=10;
                sum-=10;
                char convert=(char)sum;
                decrypted+=convert;
                l=0;
                letter="";
            }
        }
        System.out.println("Decrypted Text: ");
        System.out.println(decrypted);
        System.out.println("Thank you, program has been terminated");
    }
}