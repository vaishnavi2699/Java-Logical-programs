
import java.util.Scanner;
public class MultiInput 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to find multipliation of the table: ");
		int num,i;
		num=s.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}
