import java.util.Scanner;

public class Test2
{

	public static void main(String[] args) 
	{
		int i=0,j=0,n=0,temp=0;
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
	    System.out.println("enter n value");
		for(i=0;i<=n;i++)
		{
			n= s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<i;j++)
			{
				if(arr[i]<arr[j])
				{
					arr[i]=temp;
					arr[i]=arr[j];
					temp=arr[j];
				}
			}
		}
		for(i=0;i<=n;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
