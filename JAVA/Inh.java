class One
{
    int no=10;
}
class Two extends One
{
	Two()
	{
       System.out.println("This no is:"+no);
	}
}




class Inh
{
	public static void main(String[] args) 
	{
		Two t = new Two();
	}
}