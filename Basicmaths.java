import java.util.Scanner;
public class Basicmaths
{
    public static int  Maths(String symbol, int x, int y)
    {
        //Write your code here
        int  sum=0;
         if(symbol.equals("+"))
         {
             sum=x+y;
         }
         else if (symbol.equals("-"))
         {
             sum=x-y;
         }
         else if(symbol.equals("/"))
         {
             sum=x/y;
         }
         else if(symbol.equals("*"))
         {
             sum=x*y;
         }
         return sum;
        }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String symbol=sc.nextLine();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z= Maths(symbol,x,y);
        System.out.println(z);
    }
}
