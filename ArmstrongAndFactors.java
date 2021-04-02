import java.util.Scanner;
public class ArmstrongAndFactors
{
	Scanner s=new Scanner(System.in);
	public void Armstrong()
	{
		int num,sum=0,rem,temp;
		System.out.println("Enter number to check armstrong number or not");
		num =s.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
		
		
	}
	public void Factors()
	{
		int num,i;
		System.out.println("enter number to find factors");
		num=s.nextInt();
		for(i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+"\t");
			}
		}
	}
	public static void main(String[] args)
	{
		ArmstrongAndFactors af=new ArmstrongAndFactors();
		Scanner s=new Scanner(System.in);
		int options;
		System.out.println("enter your options to execute the program: 1.Armstrong 2.Factors: ");
		options=s.nextInt();
		switch(options)
		{
			case 1:
			{
				af.Armstrong();
				break;
			}
			case 2:
			{
				af.Factors();
				break;
			}
		}

	}

}
