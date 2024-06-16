import java.util.*;
class One
{
	Scanner sc= new Scanner(System.in);
	int no;
	One()
	{
       System.out.print("Enter number:");
	    no=sc.nextInt();
	}
}
class Table extends One
{
	Table()
	{
		int res=0;
       int i=1;
       while(i<=10)
       {
       	    res=no*i;
       	    System.out.println(no+"X"+i+"="+res);
       	    i++;
       }
	}
}
class Square extends One
{
	Square()
	{
	    for(int i=1;i<=no;i++)
		System.out.println(i+"*"+i+"="+(i*i));
	}
}
class Inh2
{
	public static void main(String[] args)
	{
		
       Table t = new Table();
       Square s = new Square();

	}
}