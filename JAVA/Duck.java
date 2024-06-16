class Duck
{
	public static void main(String[] args)
	 {
		int num = 3210;
        int m;
        int temp=num;
		while(num>0)
		{
			m =  num%10;
			num = num/10;
			if(m==0)
			{
				System.out.println("This is Duck Number " + temp);
				break;
			}
		}
	}
}