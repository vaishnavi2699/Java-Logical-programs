import java.util.Scanner;

public class Demo7
{

	public static void main(String[] args) 
	{
		int num=0,rem=0,rev=0,temp=0;
		Scanner s=new Scanner(System.in);
    	System.out.println("enter number to check palindrome number or not: ");
    	num=s.nextInt();
    	temp=num;
    	while(num!=0)
    	{
    		rem=num%10;
    		rev=rev*10+rem;
    		num=num/10;
    	}
    	if(rev==temp)
    	{
    		System.out.println("Palindrome number");
    	}
    	else
    	{
    		System.out.println("not a palindrome number");
    	}
	}

}
