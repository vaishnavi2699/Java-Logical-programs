import java.util.Scanner;

public class Test7 
{
  public static void main(String[] args)
	{
		int i=1,num,sum=0,j=1,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			temp=i;
			for(j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
				   sum=sum+j;
				}
			}
			if(sum==temp)
			{
				System.out.println(j);
			}
		}
		
			
	}
}
