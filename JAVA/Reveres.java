import java.util.*;
class Reveres
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int no[]=new int[5];

		for(int i=0;i<5;i++)
		{
			System.out.print("Enter a value=");
			no[i]=sc.nextInt();
		}
        int t; 
		int i=0;
		int j=4;
		while(i<=j)
		{
           t=no[i];
           no[i]=no[j];
           no[j]=t;
           i++;
           j--;
		}
		for(i=0;i<5;i++)
		{
			System.out.println(no[i]);
		}
	}
}