import java.util.Scanner;
public class StrongPerfect
{
	Scanner s=new Scanner(System.in);
	public void Strong()
	{
		int num,sum=0,fact=1,rem,temp;
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
	    	  System.out.println("not a strong number");
	       }
		
	}
	public void Perfect()
	{
		int i=1,num,Sum=0;
	    System.out.println("Enter number to check perfect number or not ");
	    num=s.nextInt();
	    
	    	for(i=1;i<=num/2;i++)
	    	{
	    		if(num%i==0)
	    		{
	    			Sum=Sum+i;
	    		}
	    	}
	    	if(Sum==num)
	    	{
	    		System.out.println("Strong number");
	    	}
	    	else
	    	{
	    		System.out.println("Not a Strong number");
	        }

	}

	public static void main(String[] args) 
	{
		    StrongPerfect sp=new StrongPerfect();
			Scanner s=new Scanner(System.in);
			int options;
			System.out.println("Enter options to execute the program :1.Strong 2.Perfect ");
			options=s.nextInt();
			switch(options)
			{
				case 1:
				{
					sp.Strong();
				}
				case 2:
				{
					sp.Perfect();
				}
			}
			
			
	}
		

}
