import java.util.Scanner;
class String10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        char ch;
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
            {
                count=count+1;
            }
        }
        System.out.println(count);
        
       
    }
}//Code here
