
public class Demo38
{
	public void m1()
	{
		int a=89;
		System.out.println("local varaible is: "+a);
	}
	public void m2()
	{
		int b=80;
		System.out.println("local variable is: "+b);
		
	}

	public static void main(String[] args) 
	{
		Demo38 v=new Demo38();
		v.m2();
		v.m1();

	}

}
