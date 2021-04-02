
import java.util.Scanner;
public class Perfect1
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number: ");
		int i=1,j=1,num,count=0;
		num=s.nextInt();
		while(j<=num)
		{
			for(i=1;i<=j;i++);
			{
				if(j%i==0)
				{
				  count++;
				}
			}
			if(count==2)
			{
				System.out.println(j);
			}
		j++;
		count=0;
		}
	}

}
