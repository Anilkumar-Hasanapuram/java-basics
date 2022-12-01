//Type your code here
import java.util.Scanner;
class Game
{
    public static void main(String args[])
  {
      
      Scanner Sc=new Scanner(System.in);
      {
          int a,b,a1,b1,a2,b2;
           a=Sc.nextInt();
           b=Sc.nextInt();
           a1=Sc.nextInt();
           b1=Sc.nextInt();
           a2=Sc.nextInt();
           b2=Sc.nextInt();
           int area,area1,area2,total;
           area=2*(a+b);
           area1=2*(a1+b1);
           area2=2*(a2+b2);
           total=area1+area2;
           if(total==area)
           {
               System.out.println("Karthi can fix both painting");
           }
           else if(total<area||total>area)
           {
               System.out.println("Karthi cannot fix both painting");
           }
      }
  }


}
