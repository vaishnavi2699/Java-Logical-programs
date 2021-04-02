import java.util.Scanner;
public class Test16 
{

	public static void main(String[] args) 
	{
		int i=0,num;
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
		   if(num%2==0)
		  {
			  System.out.println("mid values are: "+arr[(num/2)-1]+" and" +arr[num/2]);
		  }
		  else
		  {
			  System.out.println(arr[num/2]);
		  }
		}
		

	}

}
