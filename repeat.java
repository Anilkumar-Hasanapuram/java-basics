import java.util.*;
class repeat{
  static String repeatStr(int repeat, String string) {
    //write your logic here
     String nstr="";
    for(int i=0;i<repeat;i++)
    {
        nstr=nstr+string;
    }
    return nstr;
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String b=sc.next();
System.out.println(repeatStr(a,b));
}
}
