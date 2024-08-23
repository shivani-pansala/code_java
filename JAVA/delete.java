import java.util.*;

class delete
{
	public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);		
     int no[]=new int[5];
     int index=5;
     int flag =0; 
     for(int i=0;i<index;i++)
     {
     	System.out.print("Enter a vlaue=");
     	no[i]=sc.nextInt();
     }

     System.out.print("Enter a delete value=");
     int del=sc.nextInt();

      
     for(int i=0;i<index;i++)
     {
     	if(no[i]==del)
     	{
            for(;i<index-1;i++)
                no[i]=no[i+1]; 
            index--;
            i--;
     	}
     }
     
     for(int i=0;i<index;i++)
     {
     	System.out.println("value is = "+no[i]);
     }
	}
}