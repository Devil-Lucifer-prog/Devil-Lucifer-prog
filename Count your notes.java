import java.util.*;
class check_out_your_denominations
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount=sc.nextInt();
        int arr[]=new int[10];
        int z=0;
        int d[]={2000,500,200,100,50,20,10,5,2,1};
        while(amount!=0)
        {
            int a=amount/d[z];
            if(a>=1)
            {
                arr[z]=a;
            }
            else
            {
                arr[z]=0;
            }
            amount-=(d[z]*a);
            z++;
        }
        for(int i=0;i<=9;i++)
        {
            System.out.println("The number of "+d[i]+" ruppee denominations present are: "+arr[i]);
        }
        int ctr=0;
        for(int j=0;j<=6;j++)
        {
            ctr+=arr[j];
        }
        System.out.println("The total number of notes in the amount is: "+ctr);
    }
}
