class Nested_catch
{
	public static void main(String[] args)
	{
	    try	
	    {
	    	System.out.println("hello student");
	    	// int c=10/0;

	    }
	    catch(Exception e)
	    {
	    	System.out.println("good morning");

	    	try
	    	{
	         	// int c=10/0;

	    		System.out.println("Atmiya Univercity");
	    	}
	    	catch(Exception n)
	    	{
	    		System.out.println("MCA Sem-2");
	    	}
	    }
	    finally
	    {
	    	System.out.println("Thank you");
	    }
	}
}