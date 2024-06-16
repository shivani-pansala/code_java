import java.util.*;
   
class Get
{
	 Scanner sc = new Scanner(System.in);
    int no;

    Get(){
        System.out.print("Enter number:");
         no=sc.nextInt();   
        }
}
class Square extends Get
{
	Square()
	{
        System.out.println("Square is:"+(no*no));
	}
}
class Cube extends Get
{
	Cube()
	{
         System.out.println("cube is:"+(no*no*no));

	}
}

class Inh1
{
	public static void main(String[] args) 
	{
		Square s = new Square();
		Cube c = new Cube();
	}
}