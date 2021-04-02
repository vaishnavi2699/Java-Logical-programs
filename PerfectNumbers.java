import java.util.Scanner;
public class PerfectNumbers
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int i=1,num,Sum=0,j=1;
	    System.out.println("Enter number: ");
	    num=s.nextInt();
	    for(i=1;i<=num;i++)
	    {
	    	for(j=1;j<=i/2;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			Sum=Sum+j;
	    		}
	    	}
	    	if(Sum==i)
	    	{
	    		System.out.println(i);
	    	}
	      Sum=0;
	    }

	}

}
