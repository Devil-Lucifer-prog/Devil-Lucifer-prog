import java.util.*;
class Encryptor
{
public void encrypt(String str)
    {
        int len=str.length();
        int ascii[]=new int[len];
        char ch;
        int convert;
        int rev=0;
        int digit;
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            convert=ch;
            convert+=10;
            while(convert!=0)//reverse converted ascii
            {
                digit=convert%10;
                rev=(rev*10)+digit;
                convert/=10;
            }
            ascii[i]=rev;
            rev=0;
        }
        String encrypted="";
        int q,rem,dif;
        String hexa="";
        for(int i=0;i<len;i++)
        {
            q=ascii[i];
            while(q>16)
            {
                rem=q%16;
                if(rem<10)
                    hexa+=rem;
                else
                {
                    dif=rem-9;
                    char c;
                    int ctr=0;
                    for(c='A';c<='F';c++)
                    {
                        ctr++;
                        if(ctr==dif)
                        {
                            hexa+=c;
                            break;
                        }
                    }
                }
                q=q/16;
            }
            hexa+=q;
            for(int j=hexa.length()-1;j>=0;j--)
            {
                char r=hexa.charAt(j);
                encrypted+=r;
            }
            encrypted+="?";
            hexa="";
        }
        System.out.println("Encrypted Text: ");
        System.out.println(encrypted);
        System.out.println("Thank you, program has been terminated");
    }
}
