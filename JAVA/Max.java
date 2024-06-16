import java.util.*;

class Max
{
	public static void main(String[] args) 
	{
		int no1,no2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no:");
		no1 = sc.nextInt();
		System.out.println("Enter second no:");
		no2=sc.nextInt();

		if (no1>no2) 
		{
			System.out.println("no1 is Max"+no1);
		}
		else
		{
           System.out.println("no2 is Max"+no2);
			
		}
		
	}
}