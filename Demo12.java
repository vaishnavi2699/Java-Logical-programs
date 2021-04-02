import java.util.Scanner;                                     //2000,1000,500,100;
public class Demo12 
{
	public void notes()
	{
		int amt=0,a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter amount to print number of notes: ");
        amt=s.nextInt();
        if(amt%100==0)
        {
        	if(amt>=2000)
        	{
        		a=amt/2000;
        		amt=amt-(a*2000);
        		System.out.println("2000 rupees notes are: "+a);
        	}
        	if(amt>=1000)
        	{
        		b=amt/1000;
        		amt=amt-(b*1000);
        		System.out.println("1000 rupees notes are: "+b);
        	}
        	if(amt>=500)
        	{
        		c=amt/500;
        		amt=amt-(c*500);
        		System.out.println("500 rupees notes are: "+c);
        	}
        	if(amt>=100)
        	{
        		d=amt/100;
        		amt=amt-(d*100);
        		System.out.println("100 rupees notes are: "+d);
        	}
         }
        else
    	{
    		System.out.println("invalid amount");
    	}
    	
	}
	public void factors()
	{
		int i=1,num=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number: ");
		num=s.nextInt();
		for(i=1;i<=num/2;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("sum of factors is: "+sum);
	}
	public void factorial()
	{
		int i=1,num=0,fact=1,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number: ");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			sum=sum+fact;
		}
		System.out.println("factorail sum is: "+sum);
		System.out.println("factorial is: "+fact);
		
	}
	

	public static void main(String[] args) 
	{
		Demo12 d=new Demo12();
	  int options;
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter options to execute the program: 1.notes 2.factors 3.factorial");
	  options=s.nextInt();
	  switch(options)
	  {
	  case 1:
	  {
		 d. notes();
		 break;
	  }
	  case 2:
	  {
		  d.factors();
		  break;
	  }
	  case 3:
	  {
		  d.factorial();
		  break;
	  }
	  default:
	  {
		  System.out.println("invalid option");
	  }
	  }
	  
	  
	  
	  

	}

}
