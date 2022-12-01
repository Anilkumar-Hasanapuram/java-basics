import java.util.*;
public class Dna {
    public static String dnaToRna(String dna) 
    {
        //write your logic here
        String nstr="";
        for(int i=0;i<dna.length();i++)
        {
            char ch=dna.charAt(i);
            if(ch=='T')
            {
                ch='U';
            }
            nstr=nstr+ch;
            
        }
        return nstr;
        
    } 


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a=sc.next();
System.out.println(dnaToRna(a));
}}
