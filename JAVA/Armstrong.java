import java.util.*;
class First
{
	Scanner sc=new Scanner(System.in);
    
	First()
	{
		System.out.print("Enter number= ");
         int num = sc.nextInt();
        
		
}
class Armstrong
{
	public static void main(String[] args)
	 {
		First f= new First();

            int sum = 0;
		    int m;
		    int number = num;
  
    while(num>0)
		{
			m = num%10;
			num = num/10;
			sum = sum+(m*m*m);
		}
		if(number== sum)
		{
			System.out.println(sum +  "  This is Armstrong Number.");
		}
		else{
			System.out.println(sum + "  This is Not Armstrong Number.");
		}
	}
		
	}
}