import java.io.File;

public class Demo42
{

	public static void main(String[] args) 
	{
		File f=new File("D:\\Files");
		boolean b=f.mkdir();
		if(b)
		{
			System.out.println("File succesfully created");
		}
		else
		{
			System.out.println("File not created");
		}
		

	}

}
