

public class CountDigits
{

	public static void main(String[] args) 
	{
		int i,num=1323,count=0;
		for(i=1;num!=0;i++)
		{
			count++;
			num=num/10;
		}
		System.out.println("number of digits: "+count);

	}

}
