

public class Strong
{

	public static void main(String[] args) 
	{
       int num=145,temp,rem,fact=1,sum=0;
       temp=num;
       while(num!=0)
       {
    	   rem=num%10;
    	   while(rem>=1)
    	   {
    		   fact=fact*rem;
    		   rem--;
    	   }
    	  sum=sum+fact;
    	  fact=1;
    	  num=num/10;
       }
      if(sum==temp)
      {
    	  System.out.println("strong number");
      }
      else
      {
    	  System.out.println(" not a strong number"); 
      }

	}

}
