class prime100
{
	public static void main(String[] args) {
		int i;
		for(i=1;i<=100;i++)
		{
			boolean flag = true;
			if(i>1)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
						flag=false;
				}
				if(flag==true)
			    {
                     System.out.println(i);
			    }

			}	

		}
	}
}