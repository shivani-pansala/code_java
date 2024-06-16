import java.util.*;

class Max2
{
	public static void main(String[] args) 
	{
		int no1,no2,no3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no1:");
		no1 = sc.nextInt();
		System.out.println("Enter no2:");
		no2 = sc.nextInt();
		System.out.println("Enter no3");
		no3 = sc.nextInt();

		if(no1>no2 && no1>no3)
		{
			System.out.println("no1 is max:"+no1);
		}
		else if(no2>no1 && no2>no3)
		{
           System.out.println("no2 is max:"+no2);
		} 
		else
		{
            System.out.println("no3 is max:"+no3);
		}
	}
}