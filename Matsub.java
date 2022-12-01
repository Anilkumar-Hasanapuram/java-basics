import java.util.Scanner;
public class Matsub
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int row,column;
       row=sc.nextInt();
       column=sc.nextInt();
        int arr[][]=new int[row][column];
       int arr1[][]=new int[row][column];
       int sum[][]=new int[row][column];
       for(int i=0;i<row;i++)
       {
         for(int j=0;j<column;j++)
         {
             arr[i][j]=sc.nextInt();
         }
       }
       for(int i=0;i<row;i++)
       {
         for(int j=0;j<column;j++)
         {
             arr1[i][j]=sc.nextInt();
         }
       }
       for(int i=0;i<row;i++)
       {
         for(int j=0;j<column;j++)
         {
          sum[i][j] = arr1[i][j] - arr[i][j];
         }
       }
       for(int i=0;i<row;i++)
       {
         for(int j=0;j<column;j++)
         {
          System.out.print(sum[i][j]+" ");
         }
         System.out.println();
       }
     
    }
}
