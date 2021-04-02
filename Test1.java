import java.util.Scanner;

public class Test1
{

	public static void main(String[] args) 
	{
		int num,rem=0,sum=0,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to check armstrong number or not");
		num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}

	}

}
