import java.util.*;
class linear_search
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
     	int n[]=new int[5];
     	int key,flag=0,pos=0;

     	for(int i=0;i<5;i++)
     	{
     		System.out.print("Enter a value=");
            n[i]=sc.nextInt();
     	}

        System.out.print("Enter search number=");
        key=sc.nextInt();   

     	for( int i=0;i<5;i++)
     	{
     		if(n[i]==key)
     		{
     			flag= 1;
     			pos=i+1;
     			break;
     		}
     	}

     	if(flag==0)
     	{
     		System.out.println("not found key value");
     	}
     	else{
     		System.out.println("Number is position "+pos);
     	}
	}
}