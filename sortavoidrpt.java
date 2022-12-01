import java.util.Scanner;
public class sortavoidrpt
{
    public static void main(String args[])
    {
        String str;
        Scanner scan = new Scanner(System.in);
        str=scan.nextLine();
 
        String[] words=str.split("\\s+");
 
        for(int i=words.length-1;i>=0;i--)
        {
            System.out.print(words[i]+" ");
        }
    }
}
