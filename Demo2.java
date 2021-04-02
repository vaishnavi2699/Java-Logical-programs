import java.util.Scanner;
public class Demo2 
{

	public static void main(String[] args)
	{
		int num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to check even or odd: ");
		num=s.nextInt();
		if(num==0)
		{
			System.out.println("zero");
		}
		else if(num%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
		
		

	}

}
