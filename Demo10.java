import java.util.Scanner;
public class Demo10 
{

	public static void main(String[] args) 
	{
	   int arr[]=new int[100];
	   int search=0,i=0,j=0,num=0,count=1;
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
			if(arr[i]==arr[j])
			{
				count++;
				
			}
		  }
	   }

	}

}
