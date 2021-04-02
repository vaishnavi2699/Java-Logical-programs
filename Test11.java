
import java.util.Scanner;

public class Test11 
{
	public void asc()
	{
		int i=0,j=0,num,temp=0;
		int arr[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for(i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args)
	{
		Test11 t=new Test11();
		t.asc();

	}

}
