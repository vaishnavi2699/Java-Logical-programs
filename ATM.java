import java.util.Scanner;
public class ATM
{
	int bal=5000,wcount=1,pincount=1;
	public void validate()
	{
		int pin;
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter your pin");
	    pin=s.nextInt();
		if(pin==1234)
		{
			viewoptions();
		}
		else
		{
			pincount++;
			if(pincount<=3)
			{
		    validate();	
			}
			else
			{
			System.out.println("your card is blocked for the day");	
			}
		}
		
	}
	public void num_of_notes(int amt)
	{
		int a,b,c;
		if(amt%100==0)
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
	   } 
	public void Deposit()
	{
		int amt;
		Scanner s=new Scanner(System.in);
		System.out.println("enter deposit amount");
		amt=s.nextInt();
		if(amt%100==0)
		{
			if(amt<=40000)
			{
				bal=bal+amt;
				System.out.println("avalilable bal is: "+bal);
			}
			else
			{
				System.out.println("Deposit limit is 40000 only");
			}
		}
		else
		{
			System.out.println("please enter multiplies of 100 only");
		}
	}
	public void withdraw()
	{
		int amt;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Withdraw amt");
		amt=s.nextInt();
		if(amt%100==0)
		{
			if(amt<=20000)
			{
				if(amt<=bal)
				{
				bal=bal-amt;
				num_of_notes(amt);
				wcount++;
				System.out.println("available bal is: "+bal);
			    }
			    else 
			    {
				System.out.println("Insufficient fund");
			    }
			}
			else
			{
				System.out.println("Withdraw limit is 20000 only");
			}
		}
		else
		{
			System.out.println("please enter multiplies of 100 only");
		}
	}
	 public void balenq()
	{
		System.out.println("available bal is:  "+bal);
	}
	void viewoptions()
	{
		Scanner s=new Scanner(System.in);
		    System.out.println("1.Deposit");
			System.out.println("2.withdraw");
			System.out.println("3.bal enq");
			System.out.println("0.EXIT");
			System.out.println("choose options");
			int options=s.nextInt();
			switch(options)
			{
			case 1:
			{
				Deposit();
				viewoptions();
				break;
			}
			case 2:
			{
				if(wcount<=3)
				{
					withdraw();
				}
				else
				{
					System.out.println("withdraw limit is over for the day");
				}
				viewoptions();
				break;
			}
			case 3:
			{
				System.out.println("avaiable bal is: "+bal);
				viewoptions();
				break;
			}
			}
			
	}

	public static void main(String[] args) 
	{
		ATM a=new ATM();
		a.validate();
		
			
     }

}
