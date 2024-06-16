import java.util.*;

class Add_Array
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  size of array=");
		int size=sc.nextInt();
		System.out.print("Enter element of array= ");
		int a[]=new int[size+1];

		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.print("Enter add element=");
		int e=sc.nextInt();
		System.out.print("Enter a position= ");
		int p=sc.nextInt();

		for (int i=size;i>=p;i--)
		{
			a[i]=a[i-1];
		}
		a[p-1]=e;

		for (int i=0;i<=size;i++ ) {
			System.out.println(a[i]);
		}
	}
}