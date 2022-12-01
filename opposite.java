import java.util.*;
public class opposite{

  public static boolean isLove(final int flower1, final int flower2) {
    //write your logic here
    boolean value=true;
    if(flower1%2==0 && flower2%2==0)
    {
         value=false;   
    }
    else if(flower1%2==0 && flower2%2==1 ||flower1%2==1 && flower2%2==0)
    {
        value=true;
    }
      return value;
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

System.out.println(isLove(a,b));
}}
