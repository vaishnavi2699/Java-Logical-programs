

public class Prime
{

	public static void main(String[] args)
	{
		int i=1,num=25,j=1,count=0;
		while(j<=num)
		{
		  for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
		if(count==2)
		{
			System.out.println(j+"\t");
		}
		j++;
		count=0;
		}

	}

}
