import java.util.*;
class Mirror_Matrix_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows or coloumns");
        int m=sc.nextInt();
        int a[][]=new int[m][m];
        int mirror[][]=new int[m][m];
        System.out.println("Enter the elements");
        if(m>2&&m<28)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Original Matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            int c=0;
            int r=0;
            for (int j=m-1;j>=0;j--) 
            {
                for (int i=0;i<m;i++) 
                {
                   mirror[r][c]=a[i][j];
                   r++;
                }
                c++;
                r=0;
            }
            System.out.println("Mirror Matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(mirror[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
          System.out.println("Invalid Input");  
        }
    }
}

