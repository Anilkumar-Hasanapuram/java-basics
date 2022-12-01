import java.util.Scanner;
public class Pattern5
{
    public static void main(String[] args)
    {int i, j, row ;       
    Scanner sc=new Scanner(System.in);
    row=sc.nextInt();
    
 
for (i=0; i<row; i++)   
{   
for (j=row-i; j>1; j--)   
{  

System.out.print(" ");   
}   

for (j=0; j<=i; j++ )   
{   
     
System.out.print("*");   
}   
 
System.out.println();   
}   
}   
    }
