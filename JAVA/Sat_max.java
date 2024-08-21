import java.util.*;

class Sat_max
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	int no[] =  new int[5];

	for(int i=0;i<5;i++)
	{
		System.out.print("Enter a number=");
        no[i] = sc.nextInt();
	}
	System.out.println("---------------");
	for(int i=0;i<5;i++)
	{
       System.out.println(no[i]);
	}

	int max=no[0];
    for(int i=1;i<5;i++)
    {
       if(no[i]>max)
       {
       	max=no[i];
       }
    }

    
}

}
