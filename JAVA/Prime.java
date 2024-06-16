import java.util.*;
class Prime
{
	public static void main(String[] args) 
	{
		boolean flag= true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		int no = sc.nextInt();
        
        if(no==1)
        {
        	System.out.println("It is not prime");
        } 
        else if(no>1)
        {
        	for(int i=2;i<no;i++)
        	{
        		if(no%i ==0)
        			flag = false;
        	}
        	
        	 if(flag==false)
            {
        	System.out.println("it is not prime");
            }
            else{
        	System.out.println("It is prime");
        }
        }

	}
}