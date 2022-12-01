import java.util.*;
public class Wilson{
  public static boolean am_i_wilson(double n) {
    //write your logic here
    double fact=1;
    for(int i=1;i<n-1;i++)
    {
        fact=fact*i;
    }
    double total=(fact+1)/(n*n);
    if(total==5||total==2||total==7||total==10429||total==5||total==11||total==17)
    {
        return false;
    }
    else
    {
        return true;
    }
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
System.out.println(am_i_wilson(a));
}}
