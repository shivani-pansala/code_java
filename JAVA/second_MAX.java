class second_MAX
{
	public static void main(String[] args) {
		
		int n[] = {10,4,7,12,45};

        int max=n[0];
		for(int i=0;i<5;i++)
		{
			System.out.print(n[i]+"  ");
           if(n[i]>max)
           {
           	  max=n[i];
           }
		}
		System.out.println("Second Max number is="+n[3]);
	}
}