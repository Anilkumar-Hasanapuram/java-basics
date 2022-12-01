import java.util.Scanner;
public class Student
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new  Scanner(System.in);
        Details de=new Details();
        String name;
        String dept;
        int n;
        name=sc.nextLine();
        n=sc.nextInt();
        dept=sc.next();
        System.out.println("Student details:");
        de.display(name,n,dept);
    }
}
class Details
{

    public static void display(String name,int n,String dept)
    {
        
        System.out.println("Student name: "+name);
        System.out.println("Student ID: "+n);
        System.out.println("Department: "+dept);
        
    }

}
