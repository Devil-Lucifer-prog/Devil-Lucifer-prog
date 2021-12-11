import java.util.*;
class Binary_Search_Selection_Sort
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
        int min;
        int z=0;
        for(int k=0;k<n;k++)
        {
            min=a[k];
            z=k;
            for(int j=k+1;j<n;j++)
            {
                if(min>a[j])
                { 
                    z=j;
                                        min=a[j];
                                        
                                    }
            }
            a[z]=a[k];
            a[k]=min;
        
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