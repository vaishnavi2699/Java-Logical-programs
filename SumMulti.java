
public class SumMulti 
{
	public void add()
	{
		int a=4,b=2,c;
		c=a+b;
		System.out.println("Addition is: "+c);
	}
	public void  Multiplication()
	{
		int a=4,b=2,c;
		c=a*b;
		System.out.println("Multiplication is: "+c);
	}
	
    public static void main(String[] args) 
	{
		SumMulti sm=new SumMulti();
		sm.add();
		sm.Multiplication();
		
	}

}
