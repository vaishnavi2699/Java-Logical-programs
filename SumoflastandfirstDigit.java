

public class SumoflastandfirstDigit
{

	public static void main(String[] args) 
	{
	  int num=345,ldigit=0,fdigit=0,sum=0;
	  ldigit=num%10;
	  while(num!=0)
	  {
		  fdigit=num%10;
		  num=num/10;
	  }
	  sum=fdigit+ldigit;
	  System.out.println("First number is: "+fdigit);
	  System.out.println("last number is: "+ldigit);
	  System.out.println("Sum is: "+sum);
	  

	}

}
