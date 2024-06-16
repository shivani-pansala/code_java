class Finally
{
	public static void main(String[] args) 
	{
		String a="123";
		
		try
		{
            System.out.println("hello Student");
            Integer.parseInt(a);
            System.out.println(a);
		}
		catch(NumberFormatException n)
		{
          System.out.println(" string does not  convert  to integer");
		}
		finally
		{
           System.out.println("Finally block...");
		}
	}
}