class over
{
	
	void add(int no1,int no2)
	{
		System.out.println("Add1:"+(no1+no2));
	}
	void add(int no1,int no2,int no3)
	{
		System.out.println("Add2:"+(no1+no2+no3));
	}

}


class Sc
{
	public static void main(String[] args) 
	{
		over s1= new over();
		s1.add(10,20);
		s1.add(10,20,30);
	}
}