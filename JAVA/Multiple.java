class Multiple
{
	public static void main(String[] args)
	{
		int a=10,b=5,c;
		int arr[]=new int[3];
		try
		{ 
           System.out.println("hello first try bolck");
           c=10/b;
           System.out.println(c);
           
		}
        catch(ArithmeticException ar)
        {
         System.out.println("don't Divide by Zero");
        }

       
        try
        {
            System.out.println("Second Try bolck"); 
            System.out.println(arr[0]);
            
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
           System.out.println("Not Found index number");
	    }
	    System.out.println("finish the code....");
    }
}