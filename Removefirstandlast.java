import java.util.Scanner;
class Removefirstandlast{
	public static String removeFirstandLast(String str)
	{
		String nstr="";
		for(int i=1;i<str.length()-1;i++)
		{
		    char ch=str.charAt(i);
		    nstr=nstr+ch;
		}
			return nstr;
	}


public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
	    String str = sc.nextLine();
		System.out.print(removeFirstandLast(str));
	}
}
