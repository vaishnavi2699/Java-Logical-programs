
import java.util.Scanner;
public class PerfectNumber 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i,num,sum=0;
		System.out.println("Enter number to find strong number or not: ");
		num=s.nextInt();
		for(i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not a Perfect number");
		}
		
		

	}

}
