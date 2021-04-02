
public class Demo39 
{
	int b=90; //instance varaible
	public void m1()
	{
		int a=12; //local varaible
		System.out.println("local varaible is: "+a);
		System.out.println("Instance varaible is: "+b);
	}
	public void m2()
	{
		int a=10;
		System.out.println("local varaible is: "+a);
		System.out.println("Instance varaible is: "+b);
	}

	public static void main(String[] args) 
	{
		Demo39 obj=new Demo39();
		obj.m1();
		obj.m2();

	}

}
