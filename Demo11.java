import java.util.Scanner;

//Write a java program to input basic salary of an employee and calculate its Gross     salary according to following:
   // Basic Salary <= 10000 : HRA = 20%, DA = 80%;
  //  Basic Salary <= 20000 : HRA = 25%, DA = 90%;
 //   Basic Salary > 20000 : HRA = 30%, DA = 95%;
public class Demo11 {

	public static void main(String[] args) 
	{
       int  basicsalary=0,hra=0,da=0,gs=0,num=0;
       Scanner s=new Scanner(System.in);
       System.out.println("enter basicsalary : ");
       basicsalary=s.nextInt();
       if(basicsalary<=10000)
       {
    	   hra=(basicsalary/100)*20;
    	   da=(basicsalary/100)*80;
    	   gs=hra+da+basicsalary;
    	   System.out.println("hra is: "+hra);
    	   System.out.println("da is: "+da);
    	   System.out.println("gs is: "+gs);
       }
       else if(basicsalary<=20000)
       {
    	   hra=(basicsalary/100)*25;
    	   da=(basicsalary/100)*90;
    	   gs=hra+da+basicsalary;
    	   System.out.println("hra is: "+hra);
    	   System.out.println("da is: "+da);
    	   System.out.println("gs is: "+gs);
       }
       else if(basicsalary>20000)
       {
    	   hra=(basicsalary/100)*30;
    	   da=(basicsalary/100)*95;
    	   gs=hra+da+basicsalary;
    	   System.out.println("hra is: "+hra);
    	   System.out.println("da is: "+da);
    	   System.out.println("gs is: "+gs);
       }
       

	}

}
