import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) 
	{
		int i=1,j=1,num,count=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" ");
			}
			count=0;
			
		}
		
	}

}
