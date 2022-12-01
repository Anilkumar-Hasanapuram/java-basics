import java.util.Scanner;
public class Lower
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int row;
       row=sc.nextInt();
       int c=row;
       int count=0;
       int arr[][]=new int[row][c];
       for(int i=0;i<row;i++)
       {
         for(int j=0;j<c;j++)
         {
             arr[i][j]=sc.nextInt();
         }
       }
        if(arr[0][1]==0 && arr[0][2]==0 && arr[1][2]==0)
        {
            System.out.println("Lower triangular matrix");
        }
        else
        {
            System.out.println("Not a lower triangular matrix");
        }
     
    }
}
