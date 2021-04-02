

public class Armstrong 
{

	public static void main(String[] args)
	{
		int i,num=370,rem,temp,sum=0;
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
			System.out.println(" Not a Armstrong number");
		}

	}

}
