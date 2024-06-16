import java.util.*;

class number
{
	number()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number=");
		int no=sc.nextInt();
        int square;
        int rem;
          
        square= no*no;
        System.out.println("Square is "+square);

        while(no>0)
        {
        	if(no%10 != square%10)
        	{
        		System.out.println("Not Automorphic");
        		break;
        	}
        	else
        	{
        		System.out.println("Automorphic");
        		 no=no/10;
        	     square/=10;
        		break;
        	}

        	
        }

  }
}


class Automorphic
{
	public static void main(String[] args) 
	{
		number n = new number();
	}
}