
public class Demo40 
{
	 static int c=90; //Static varaible
	 int b=56; //Instance varaible
	 public void m1()
	 {
		 int a=24;
		 System.out.println("local is: "+a);
		 System.out.println("Instance is: "+b);
		 System.out.println("Static is: "+c);
	 }
	 public void m2()
	 {
		 int a=28;
		 System.out.println("local is: "+a);
		 System.out.println("Instance is: "+b);
		 System.out.println("Static is: "+c);
	 }
	 public static void main(String[] args) 
	{
		Demo40 obj=new Demo40();
		obj.m1();
		obj.m2();
	}

}
