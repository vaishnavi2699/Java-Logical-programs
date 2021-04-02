// Write a java  program to enter a number and print its reverse.
import java.util.Scanner;
public class Demo4 
{
    public void reversenumber()
    {
    	int num=0,rem=0,rev=0;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter number to print reverse of a number: ");
    	num=s.nextInt();
    	while(num!=0)
    	{
    		rem=num%10;
    		rev=rev*10+rem;
    		num=num/10;
    	}
    	System.out.println("reverse number is: "+rev);
    	
    }
	public static void main(String[] args)
	{
		Demo4 d=new Demo4();
		d.reversenumber();
				
	

	}

}
