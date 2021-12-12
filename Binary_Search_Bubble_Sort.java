import java.util.*;
class Binary_Search_Bubble_Sort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int search=sc.nextInt();
        int mid=0;
        int lower=0;
        int upper=n-1;
        int flag=0;
        int z=0;
        for(int k=0;k<n-1;k++)
        {
            for(int l=0;l<(n-1)-k;l++)
            {
               if(a[l]>a[l+1])
               {
                   z=a[l];
                   a[l]=a[l+1];
                   a[l+1]=z;
               }
            }
        }
           
        while(lower<=upper)
        {
            mid=(lower+upper)/2;
            if(search>a[mid])
            {
                lower=mid+1;
            }
            else if(search<a[mid])
            {
                upper=mid-1;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Search successful element found");
        }
        else
        {
            System.out.println("Search successful element not found");
        }
    }
}
