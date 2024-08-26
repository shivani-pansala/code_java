import java.util.*;
class selection_sort
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int n[]=new int[5];

     	for(int i=0;i<5;i++)
     	{
     		System.out.print("Enter a value=");
            n[i]=sc.nextInt();
     	}

     	for(int i=0;i<5;i++)
     	{
     		System.out.println(" " +n[i]);
     	}
        int t=0;
     	for(int i=0;i<4;i++)
     	{
     		for(int j=i+1;j<5;j++)
     		{
                if(n[i]>n[j])
                {
                	t=n[i];
                	n[i]=n[j];
                	n[j]=t;
                }
     		}
     	}

     	for(int i=0;i<5;i++)
     	{
     		System.out.println(n[i]);
     	}

	}

}