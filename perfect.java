

public class perfect 
{

	public static void main(String[] args)
	{
		int i,num=6,sum=0;
		for(i=1;i<num;i++)
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
			System.out.println("not a Perfect number");	
		}

	}

}
