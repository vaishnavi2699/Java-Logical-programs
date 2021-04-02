import java.util.Scanner;

public class Demo3 
{

	public static void main(String[] args) 
	{
		int num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to check postive or negetive number: ");
		num=s.nextInt();
		if(num==0)
		{
			System.out.println("Zero");
		}
		else if(num>0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("negative number");
		}

	}

}
