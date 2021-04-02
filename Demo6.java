import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) 
	{
		int i=0,rem=0,fact=1,sum=0,temp,num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to print strong number or not: ");
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
		if(sum==temp)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
        
	}

}
