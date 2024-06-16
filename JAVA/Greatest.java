class Greatest
{
	public static void main(String[] args) 
	{
		int no1=30;
		int no2=50;
		int no3=70;
		if(no1>no2)
		{
			if(no1>no3)
			{
				System.out.println(no1 + " NO1 is Big");
			}
			else
			{
				System.out.println(no3 + " No3 is big");
			}
		}
		else
		{
			if(no2>no3)
			{
				System.out.println(no2 + " NO2 is Big");
			}
			else
			{
				System.out.println(no3 + " No3 is big");
			}
		}
	}
}