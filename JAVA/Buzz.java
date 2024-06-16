class Buzz
{
	public static void main(String[] args) 
	{
		int num = 1007;

		if(num%10 == 7 || num%7 == 0)
		{
			System.out.println(num + " This Buzz Number");
		}
		else
		{
			System.out.println(num + " This is Not Buzz Number");
		}
	}
}