//WAP to accept n values and print frequency of each value;
import java.util.Scanner;
public class Test10 
{

	public static void main(String[] args)
	{
		int i=0,j=0,num,count=1;
		int arr[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter");
		num=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
			for(i=0;i<num;i++)
			{
				for(j=i+1;j<num;j++)
				{
					if(arr[i]==arr[j]) //12,34,12,56,78
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println("no.of frequencies: "+arr[j]);
				}
			}
			
		for(i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
