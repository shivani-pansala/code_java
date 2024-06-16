import java.util.*;
class first
{
	first()
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter one number=");
	int no1=sc.nextInt();
	System.out.print("Enter second number=");
	int no2=sc.nextInt();
    int sumA=0;
    int sumB=0; 
		for(int i=1;i<no1;i++)
		{
			if(no1%i==0)
			{
				System.out.print(i+"  ");
				sumA=sumA+i;
			}
		}
		System.out.println();
		for (int i=1;i<no2;i++)
		{
			if(no2%i==0)
			{
				System.out.print(i+"  ");
				sumB=sumB+i;
			}
		}
        System.out.println();
		if (sumA==no2 && sumB==no1)
		{
			System.out.println("SumA is:"+sumA+" = "+"no2 is:"+no2);
			System.out.println("SumB is:"+sumB+" = "+"no1 is:"+no1);
			System.out.println("The number is Amicable");
		}
		else
		{
			System.out.println("This is number is not Amicable");
		}
	}
	
}
class Amicable
{
	public static void main(String[] args)
    {
		
		first f=new first();
	}
}