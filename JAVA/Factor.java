import java.util.*;

class first
{
	first()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int no=sc.nextInt();

		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}

class Factor 
{
	public static void main(String[] args) 
	{
		first f= new first();
	}
}
