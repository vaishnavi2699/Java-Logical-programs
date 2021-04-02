
public class Demo41 
{
	int b=21;
	static int c=12;
	public void m1()
	{
		System.out.println("instance varaible is: "+b);
		System.out.println("this is instance method");
	}
	public  static void m2()
	{
		System.out.println("static varaible is: "+c);
		System.out.println("this is static method");
	}
    public static void main(String[] args)
	{
		Demo41 obj=new Demo41();
		obj.m1();
		Demo41.m2();

	}

}
