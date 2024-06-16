import java.util.*;

class First
{
	void std(int no)
	{
            System.out.println("roll no:"+no);
	}
	void std(String nm,int no)
	{
		System.out.println("roll no:"+no);
        System.out.println("Name:"+nm);
	}
}

class M_o
{
	public static void main(String[] args)
	 {
	 	
		 Scanner sc= new Scanner(System.in);

         System.out.print("Enter name:");
		  String nm=sc.nextLine();

 s
		 System.out.print("Enter Rollno:");
		 int no=sc.nextInt();
		  
		  
		  First f = new First();
		  f.std(no);
		  f.std(nm,no);

	}
}