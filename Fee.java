import java.util.Scanner;
public class Fee
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        float a,b,c,d,e,f,g,h;
        System.out.println("Enter the student type");
        String s=sc.nextLine();
        switch(s)
        {
            case "MSDS":
                     System.out.println("Enter tuition fee");
                        
                        a=sc.nextFloat();
                        System.out.println("Enter bus fee");
                        b=sc.nextFloat();
                        System.out.printf("The fees to be paid by the student is Rs.%.2f",a+b);
                        break;
          
            case "MSH":System.out.println("Enter tuition fee");
                        
                        c=sc.nextFloat();
                        System.out.println("Enter hostel fee");
                        d=sc.nextFloat();
                        System.out.printf("The fees to be paid by the student is Rs.%.2f",c+d);
                        break;
            case "MGSDS":System.out.println("Enter tuition fee");
                        
                        e=sc.nextFloat();
                        System.out.println("Enter bus fee");
                        f=sc.nextFloat();
                        float a1=(150*e)/100;
                        System.out.printf("The fees to be paid by the student is Rs.%.2f",a1+f);
                        break;
             case "MGSH":System.out.println("Enter tuition fee");
                        
                        g=sc.nextFloat();
                        System.out.println("Enter hostel fee");
                        h=sc.nextFloat();
                         float a2=(150*g)/100;
                        System.out.printf("The fees to be paid by the student is Rs.%.2f",a2+h);
                        break;
        }
    }
}
