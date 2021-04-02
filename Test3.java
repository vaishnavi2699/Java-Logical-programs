import java.util.Scanner;

public class Test3 
{

	public static void main(String[] args)
	{
		int arr[]=new int[5];
		int num=0,i=0,j=0,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number to print frequency of it");
		for(i=1;i<=num;i++)
		{
			num=s.nextInt();
		}
		 for(i=1;i<num;i++)
		 {
			for(j=i+1;j<num;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
					
			}
			System.out.println("number of frequencies: "+count);
		 }
		 for(i=0;i<=num;i++)
		 {
			 System.out.println(i);
		 }
     }

}

