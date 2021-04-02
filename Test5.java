import java.util.Scanner;

public class Test5 
{
	public void prime()
	{
		int i=1,j=2,count=0,n=0; //divisible by 1 and itsself
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number");
		n=s.nextInt();
		for(j=2;j<=n;j++)
		{
			for(i=1;i<=j;i++)
			{
				    if(j%i==0)
					{
					 count++;
					}
			}
			if(count==2)
			{
				System.out.println(j+" ");
			}
			count=0;
		}
	 }
		

	public static void main(String[] args)
	{
		Test5 t=new Test5();
		t.prime();
		

	}

}
