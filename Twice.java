import java.util.*;
public class Twice {

  public static int TwiceAsOld(int dadYears, int sonYears){
    //write your logic here
    int son=sonYears*2;
    int dad=dadYears-son;
    return dad;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int dadYears=sc.nextInt();
int sonYears=sc.nextInt();
System.out.println(TwiceAsOld(dadYears,sonYears));
}}
