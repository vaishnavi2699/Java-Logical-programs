

public class primenumbers 
{

	public static void main(String[] args)
	{
		int i=1,num=17,count=0;
		while(i<=num)
		{
			if(num%i==0)
			{
				count++;
			}
		i++;
		}
		if(count==2)
		{
		System.out.println("primenumber");
		}
		else
		{
			System.out.println("not a primenumber");
		}

	}

}
