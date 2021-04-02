import java.util.Scanner;

public class Characters
{

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter string to find number of characters");
	String str=s.nextLine();
	System.out.println("number of characters: "+str.length());

	}

}
