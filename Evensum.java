

public class Evensum 
{

	public static void main(String[] args)
	{
		int i=1,num=14,evensum=0;
	     while(i<=num)
		{
		    if(i%2==0)
		    {
		    	evensum=evensum+i;
		    }
		    i++;
		 
		}
	     System.out.println("evensum is: "+evensum);
	}

}
