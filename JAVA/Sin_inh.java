import java.util.*;
class User
{
	Scanner sc = new Scanner(System.in);
	String nm[]=new String[5];
	User()
	{
		for(int i=0;i<nm.length;i++)
		{
			System.out.print("Enter Your Friends name:");
			nm[i]=sc.nextLine();
		}
	}
}
class Display extends User
{
	Display()
	{
		for(int i=0;i<nm.length;i++)
		{
			System.out.println("Friends Name:"+i+"->"+nm[i]);
		}
	}
}



class Sin_inh
{
	public static void main(String[] args) 
	{
		Display d= new Display();
	}
}