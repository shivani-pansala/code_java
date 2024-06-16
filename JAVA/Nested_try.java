class Nested_try
{
	public static void main(String[] args)
	{
		int a=10,b=0,c;
	     try	
	     {
	     	System.out.println("start try");
	     	int arr[]=new int[3];
	     	System.out.println(arr[2]);


		     	try
		     	{
		     		System.out.println("Nested Try");
	                 c=a/b;
		     	}
		     	catch(ArithmeticException e)
		     	{
		     		System.out.println("Not Divide by Zero");
		     	}
	     }
	     catch(ArrayIndexOutOfBoundsException n)
	     {
	     	System.out.println("Null Exception");
	     }
	}
}