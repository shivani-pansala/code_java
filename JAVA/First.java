class First
{
	public static void main(String[] args) 
	{
		int a=10,b=0,c;
		System.out.println("Exception Handling....");
		try
		{
           c=a/b;
           System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("not divided by 0");
		}
		System.out.println("finish code....");
	}
}