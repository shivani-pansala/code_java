package pack;
import java util.*;

 public class Salary
{
     
	  Scanner Sc new Scanner(System.in);
	  details e = new details();
	  int Salary;
	  public Salary()	
	  {
	  	System.out.println("Calculate net Salary":);
	  	System.out.println("Enter Salary");
	  	Salary = sc.nextInt();

	  	if(Salary<10000)
	  	{
	  		int ta=5;
	  		int da=2;
	  		int net= Salary+ta+da;
	  		System.out.println("tax(2%):"+tax);
	  	}
	  }
	
}