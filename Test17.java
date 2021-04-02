
public class Test17 
{
	public int[] asc(int arr[],int n)
	{
		int i=0,j=0,temp=0;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args)
	{
	  Test17 t=new Test17();
	  int arr[]= {12,78,54,32,11,90};
	  arr=t.asc(arr, 6);
	  for(int i=0;i<6;i++)
	  {
		  System.out.println(arr[i]);
	  }

	}

}
