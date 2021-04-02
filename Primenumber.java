
import java.util.Scanner;
public class Primenumber
{

	public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	  int i,num,count=0;
	  System.out.println("enter number to check prime number or not");
	  num=s.nextInt();
	  
	  for(i=1;i<=num;i++)
		  
	  {
		  if(num%i==0)
		  {
			  count++;		 
		  }
	  }
	  if(count==2)
	  {
		  System.out.println("Primenumber");
	  }
	  else
	  {
		  System.out.println("  not a Primenumber");

	  }

	}

}
