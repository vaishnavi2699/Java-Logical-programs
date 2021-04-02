

public class GrossSalary
{
	public static void main(String[] args) 
	{
		int hra,da,gs,basicsalary=15000;
		if(basicsalary<=15000)
		{
			hra=(basicsalary/100)*20;
			da=(basicsalary/100)*30;
			gs=hra+da+basicsalary;
		    System.out.println("hra is: "+hra);
		    System.out.println("da is: "+da);
		    System.out.println("gs is: "+gs);
		}
		
  
		

	}

}
