import java.util.Scanner;

public class Test13 
{

	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter numbers to check maximum number: ");
		num1=s.nextInt();
		num2=s.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is maximum number: "+num1);
		}
		else
		{
			System.out.println("num2 is maximum number: "+num2);
		}
		

	}

}
