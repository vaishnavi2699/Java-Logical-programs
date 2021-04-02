import java.util.Scanner;

public class Test6 
{

	public static void main(String[] args)
	{
	 int num,sum=0,fact=1,rem,i=1,temp=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter your number");
	 num=s.nextInt();
	 temp=num;
	 for(i=1;i<=num;i=num%10)
	 {
		 while(i!=0)
		 {
			  if(i>=1)
			 {
				 fact=fact*i;
				 i--;
			 }
			sum=sum+fact;
			fact=1;
			i=i/10;
		 }
		 if(i==temp)
		 {
			 System.out.println(i);
		 }
	 }
	 
		
	  
	}
 }