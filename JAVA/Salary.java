import java.util.*;
class Salary
{  
	public static void main(String[] args) 
	{
	  	int sal[] = new int[5];
	  	String name[] = new String[5];
	  	Scanner sc = new Scanner(System.in);
        int k=1,temp=0;
        for (int i =0;i<5;i++)
        {
        	System.out.print("Enter name->"+k+":");
          	name[i]=sc.nextLine();
          	k++;
        }  
        System.out.println("--------------------------------");
        k=1;
         for (int i =0;i<5;i++)
        {
        	System.out.print("Enter marks of  "+name[i]+ "->" );
          	sal[i]=sc.nextInt();
          	k++;
        }  
        System.out.println("------------------------------------");

          for (int i =0;i<5;i++)
        {
        	System.out.println("Disply   "+name[i]+   "       of   mark -> "+sal[i] );
        } 
        System.out.println("------------------------------------");
        
       
       int position=0;
       int max=sal[0];
       for(int i=0;i<5;i++)
       {
        if(max < sal[i])
        {
          max=sal[i];
          position=i;
        }
       }
        System.out.println("Highest salary:" + sal[position]+ "name :  "+name[position] );
	}
}
