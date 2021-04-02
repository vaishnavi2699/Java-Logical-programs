import java.util.Scanner;
public class Demo1 
{

	public static void main(String[] args) 
	{
		int num,i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to print multiplication of a table: ");
		num=s.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		

	}

}
