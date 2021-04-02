

public class FirstandLastDigit
{

	public static void main(String[] args)
	{
		int i=1,num=6789,lDigit=0,fDigit=0;
		lDigit=num%10;
		while(num!=0)
		{
			fDigit=num%10;
			num=num/10;
		}
		
		System.out.println("First number is: "+fDigit);
		System.out.println("Last number is: "+lDigit);

	}

}
