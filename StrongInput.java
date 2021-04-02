
import java.util.Scanner;
public class StrongInput 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int num,rem,temp,sum=0,fact=1;
		System.out.println("Enter number to check strong number or not");
		num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			while(rem>=1)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			fact=1;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a Strong number");
		}
		

	}

}
