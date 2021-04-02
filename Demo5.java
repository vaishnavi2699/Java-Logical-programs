import java.util.Scanner;

public class Demo5 
{

	public static void main(String[] args)
	{
		int i=1,num=0,rem,fact=1;;
		Scanner s=new Scanner(System.in);
    	System.out.println("enter number to print factorial of a given number: ");
    	num=s.nextInt();
    	 while(i<=num)
    	{
    	 fact=fact*i;
    	 i++;
    	}
    	 System.out.println("factorail is: "+fact);

	}

}
