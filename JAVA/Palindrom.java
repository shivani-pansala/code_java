import java.util.*;

class Palindrom
{
	public static void main(String[] args) 
	{
		int r=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vlaue:");
		int num = sc.nextInt();
		int temp=num;

    while(num>0)
    {
    	 r = num%10;
    	 sum=(sum*10)+r;
    	 num=num/10;
    } 
    if(sum==temp)
    {
    	System.out.println("it is palindrom");
    }
    else
    {
    	System.out.println("it is not palindrom");
    }
	}
}