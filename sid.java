import java.util.*;
public class sid {
    public static String howMuchILoveYou(int nb_petals) {
    //write your logic here
    String nstr="";
    if(nb_petals==1||nb_petals==7||nb_petals==13)
    {
        nstr="I love you";
    }
    if(nb_petals==2||nb_petals==8||nb_petals==14)
    {
        nstr="a little";
    }
    if(nb_petals==3||nb_petals==9||nb_petals==15)
    {
        nstr="a lot";
    }
    if(nb_petals==4||nb_petals==10||nb_petals==16)
    {
        nstr="passionately";
    }
    if(nb_petals==5||nb_petals==11||nb_petals==17)
    {
        nstr="madly";
    }
    if(nb_petals==6||nb_petals==12||nb_petals==18)
    {
        nstr="not at all";
    }
    return nstr;
    }
    
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(howMuchILoveYou(a));
}}
