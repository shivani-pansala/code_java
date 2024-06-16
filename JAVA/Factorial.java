import java.util.*;

class first
{
	first()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number=");
		int no=sc.nextInt();
        int fact=1;

		for (int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+no+  " = "+fact);
	}
}

class Factorial
{
	public static void main(String[] args) 
	{
	     first f = new first();	
	}
}