import java.util.Scanner;
public class transpose
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int row,column;
       row=sc.nextInt();
       
        int arr[][]=new int[row][row];
        int arr1[][]=new int[row][row];
       for(int i=0;i<row;i++)
       {
         for(int j=0;j<row;j++)
         {
             arr[i][j]=sc.nextInt();
         }
       }
       for(int i=0;i<row;i++)
       {
         for(int j=0;j<row;j++)
         {
            arr1[i][j]=arr[j][i];
         }
       }
       System.out.println("Transpose matrix is :");
      for(int i=0;i<row;i++)
       {
         for(int j=0;j<row;j++)
         {
            System.out.print(arr1[i][j]+" ");
         }
         System.out.println("\n");
       }
      
       
       
     
    }
}
