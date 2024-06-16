import java.util.*;
class number
{
	number()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int no = sc.nextInt();
        int square;
        int rem;
        int sum=0;
        
        square=no*no;
        System.out.println(no+" = "+square);

        while(square>0)
        {
           rem=square%10;
           sum=sum+rem;
           square=square/10;
        }
        if (no==sum)
        {
        	System.out.println(no+" is Neon");
        }
        else
        {
        	System.out.println(no+"  is not Neon ");
        }
	}
}
class Neon
{
	public static void main(String[] args)
	{
		number n = new number();
	}
}