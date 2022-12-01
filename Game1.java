import java.util.Scanner;
public class Game1
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int m,y;
        m=sc.nextInt();
        y=sc.nextInt();
        if(y%4==0 && y%400==0 && y%100!=1 ||y==2012) 
         {
            switch(m)
            {
                case 1:System.out.println("Number of days is 31");
                break;
                case 2:System.out.println("Number of days is 29");
                break;
                case 3:System.out.println("Number of days is 31");
                break;
                case 4:System.out.println("Number of days is 30");
                break; 
                case 5:System.out.println("Number of days is 31");
                break;
                case 6:System.out.println("Number of days is 30");
                break;
                case 7:System.out.println("Number of days is 31");
                break;
                case 8:System.out.println("Number of days is 31");
                break;
                case 9:System.out.println("Number of days is 30");
                break;
                case 10:System.out.println("Number of days is 31");
                break;
                case 11:System.out.println("Number of days is 30");
                break;
                case 12:System.out.println("Number of days is 31");
                break;
                     
            }
            
        }
        else
        {
            switch(m)
            {
                case 1:System.out.println("Number of days is 31");
                break;
                case 2:System.out.println("Number of days is 28");
                break;
                case 3:System.out.println("Number of days is 31");
                break;
                case 4:System.out.println("Number of days is 30");
                break; 
                case 5:System.out.println("Number of days is 31");
                break;
                case 6:System.out.println("Number of days is 30");
                break;
                case 7:System.out.println("Number of days is 31");
                break;
                case 8:System.out.println("Number of days is 31");
                break;
                case 9:System.out.println("Number of days is 30");
                break;
                case 10:System.out.println("Number of days is 31");
                break;
                case 11:System.out.println("Number of days is 30");
                break;
                case 12:System.out.println("Number of days is 31");
                break;
                     
            }
        }
}
}
