import java.util.Scanner;
public class Demo9 
{

	public static void main(String[] args)
	{
		int i=0,num=0,evensum=0,evencount=0,oddsum=0,oddcount=0;
		int arr[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter");
		num=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("even values are: ");
		for(i=0;i<num;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				evensum=evensum+arr[i];
				evencount++;
			}
		}
		System.out.println("evencount is: "+evencount);
		System.out.println("evensum is: "+evensum);
		System.out.println("odd values are: ");
		for(i=0;i<num;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
				oddsum=oddsum+arr[i];
				oddcount++;
			}
		}
		System.out.println("oddcount is: "+oddcount);
		System.out.println("oddsum is: "+oddsum);
		

	}

}
