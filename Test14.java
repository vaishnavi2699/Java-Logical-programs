// WAP in array to accept n values and print minimum value?
import java.util.Scanner;

public class Test14
{

	public static void main(String[] args) 
	{
		int min=0,i=0,num;
		int arr[]=new int[100];
	    Scanner s=new Scanner(System.in);
	    System.out.println("How many values do you want to enter: ");
	    num=s.nextInt();
	    min=s.nextInt();
	    for(i=0;i<num;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    for(i=0;i<num;i++)
	    {
	    	  if(min>arr[i]) //23,45,67,11,89;
		      {
		    	  min=arr[i];
		      }
	      
	    }
	    System.out.println("minimum value is: "+min);
	   
	}

}
