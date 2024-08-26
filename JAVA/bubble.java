import java.util.*;
class bubble
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int n[]=new int[5];

     	for(int i=0;i<5;i++)
     	{
     		System.out.print("Enter a value=");
            n[i]=sc.nextInt();
     	}

        int t=0;
     	for(int i=0;i<4;i++)
     	{
     		for(int j=0;j<4-i;j++)
     		{
     			if(n[j]>n[j+1])
     			{
                    t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;
     			}
     		}
     	}

     	for(int i=0;i<5;i++)
     	{
     		System.out.println(n[i]);
     	}
     }
 }