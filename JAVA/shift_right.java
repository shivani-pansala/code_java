import java.util.*;
class shift_right
{
     public static void main(String[] args) {
     	
     	Scanner sc = new Scanner(System.in);
     	int n[]=new int[5];

     	for(int i=0;i<5;i++)
     	{
     		System.out.print("Enter a value=");
            n[i]=sc.nextInt();
     	}

     	int last = n[4];
     	for(int i=3;i>=0;i--)
     	{
     		n[i+1]=n[i];
     	}
     	n[0]=last;

     	for(int i=0;i<5;i++)
     	{
     		System.out.println(n[i]);
     	}
     }
}