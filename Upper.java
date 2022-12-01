import java.util.Scanner;
public class Upper
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
        if(arr[1][0]==0 && arr[2][0]==0 && arr[2][1]==0)
        {
            System.out.println("Upper triangular matrix");
        }
        else
        {
            System.out.println("Not an Upper Triangular Matrix");
        }
     
    }
}
