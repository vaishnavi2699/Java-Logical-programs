import java.util.Scanner;

public class Test8 
{

	public static void main(String[] args) 
	{
		int i=1,fdigit=0,ldigit=0,num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check first and last digit");
		num=s.nextInt();
		ldigit=num%10;
		while(num!=0)
		{
			fdigit=num%10;
			num=num/10;
		}
		System.out.println("First digit is: "+fdigit);
		System.out.println("last digit is: "+ldigit);
		

	}

}
