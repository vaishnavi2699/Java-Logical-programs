import java.util.Scanner;

public class Test18 
{

	public static void main(String[] args) 
	{
		int sum=0,a=0,b=0,c=0,avg=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to check sum and avg of a number: ");
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		avg=sum/2;
		System.out.println("sum is : "+sum);
		System.out.println("avg is : "+avg);
		
		

	}

}
