import java.util.*;
class Fibbonacci
{
	public static void main(String[] args) 
	{
		int f1=0,f2=1;
		int f3=0;
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		System.out.println(f1);
		System.out.println(f2);

	  for(int i=1;i<=no-2;i++)
	  {
	  	f3 = f1+f2;
	  	f1 = f2;
	  	f2 = f3;
	  }
	  System.out.println(f3);
	}
}