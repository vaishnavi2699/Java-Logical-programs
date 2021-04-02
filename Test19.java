import java.util.Scanner;
public class Test19 
{

	public static void main(String[] args) 
	{
		int fdigit=0,ldigit=0,num,sum=0,avg=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to print first and last number");
        num=s.nextInt();
        ldigit=num%10;
         while(num!=0)
         { 
        	 fdigit=num%10;
        	 num=num/10;
         }
         sum=fdigit+ldigit;
         avg=sum/2;
         System.out.println("first digit is: "+fdigit);
         System.out.println("last digit is: "+ldigit);
         System.out.println("sum of digits are: "+sum);
         System.out.println("avg number is: "+avg);
	}

}
