
import java.io.*;
import java.util.*;
class Main extends Circle{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	Main gg=new Main();
	String s=sc.next();
	if(s.equals("S")||s.equals("s"))
	{
	    gg.squr();
	    
	}
	else if(s.equals("R")||s.equals("r"))
	{
	  
	    gg.rect();
	    
	}
	else if(s.equals("C")||s.equals("c"))
	{
	    
	    gg.cir();
	    
	}
}	
	
}
class Square
{
     Scanner sc=new Scanner(System.in);
    void squr()
    {
        int a=sc.nextInt();
        double b=a*4;
        double c=a*5;
        System.out.println("Perimeter "+b);
        System.out.println("Area "+c);
    }
}
class Rectangle extends Square
{
    Scanner sc=new Scanner(System.in);
    void rect()
    {
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        double b=2*(a1+b1);
        double c=a1*b1;
        System.out.println("Perimeter "+b);
        System.out.println("Area "+c);
    }
}
class Circle extends Rectangle
{
     Scanner sc=new Scanner(System.in);
    void cir()
    {
        int a=sc.nextInt();
        double b=2*3.14*a;
        double c=3.14*a*a;
        System.out.println("Perimeter "+b);
        System.out.println("Area "+c);
    }
}



