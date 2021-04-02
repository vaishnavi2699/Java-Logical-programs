import java.util.Scanner;

public class Test9
{

	public static void main(String[] args)
	{
		int num,ldigit=0,fdigit=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check sum of first and last digits");
		num=s.nextInt();
		ldigit=num%10;
		while(num!=0)
		{
			fdigit=num%10;
			num=num/10;
			sum=fdigit+ldigit;
		}
		System.out.println("first number is: "+fdigit);
		System.out.println("last number is: "+ldigit);
		System.out.println("sum of first and last digits are: "+sum);

	}

}
