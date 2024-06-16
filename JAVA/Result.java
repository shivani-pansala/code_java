import java.util.*;
class Result
{  
	public static void main(String[] args) 
	{
	  	int mark[] = new int[5];
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
          	mark[i]=sc.nextInt();
          	k++;
         }  
        System.out.println("------------------------------------");

          for (int i =0;i<5;i++)
        {
        	System.out.println("Disply   "+name[i]+   "       of   mark -> "+mark[i] );
        } 
        System.out.println("------------------------------------");
        System.out.println("Sorting of marks");
        k=1;
        for(int i=0;i<5;i++)
        {
        	for(int j=i+1;j<5;j++)
        	{
        		if(mark[i]>mark[j])
        		{
        			temp=mark[i];
        			mark[i]=mark[j];
        			mark[j]=temp;
        		}
        	}

        	System.out.println("Sorting marks of  "+k+ ":" +mark[i]);
        	k++;
        }
        System.out.println("=======Topper Student=========");
        System.out.println("Topper student marks  " +mark[0]);

	}
}