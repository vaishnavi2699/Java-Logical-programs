import java.util.Scanner;

public class Test15
{

	public static void main(String[] args)
	{
		int max=0,num,i=0;
		int arr[]=new int[100];
		Scanner  s=new Scanner(System.in);
		System.out.println("How many values do you want to enter");
		num=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<num;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("maximum value is: "+max);
		

	}

}
