

public class Atm
{

	public static void main(String[] args) 
	{
		int amt=6600,a,b,c;
		if(amt%100==0)                          //2000,500,100
		{
			if(amt>=2000)
			{
				a=amt/2000;
				amt=amt-(a*2000);
			    System.out.println("2000 rupees notes are: "+a);
			}
			if(amt>=500)
			{
				b=amt/500;
				amt=amt-(b*500);
			    System.out.println("500 rupees notes are: "+b);
			}
			if(amt>=100)
			{
				c=amt/100;
				amt=amt-(c*100);
			    System.out.println("100 rupees notes are: "+c);
			}
			
			
		}
		else
		{
			System.out.println("Invalid amount");
		}

	}

}
