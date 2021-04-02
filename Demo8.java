import java.util.Scanner;

public class Demo8 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[100];
		int i=0,num,search=0,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter search element");
		search=s.nextInt();
		for(i=0;i<num;i++)
		{
			if(search==arr[i])
			{
				count++;
				break;
			}
		}
		if(count!=0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		

	}

}
