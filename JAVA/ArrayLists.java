import java.util.*;

class ArrayLists
{
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		//add element

		list.add(5);
		list.add(3);
		list.add(2);
		list.add(6);

		System.out.println(list);

		//get element

		int ser = list.get(1);

		System.out.println(ser);

        // modify elemet add 

        list.add(1,4);

        System.out.println(list);


        //remove elemet
        list.remove(4);

        System.out.println(list);

        //set elemet

        list.set(3,1);

        System.out.println(list);

         //size of elemet

       int total = list.size();
       System.out.println("Total Element =    "+  total);


       //loop

       for(int i=0;i<list.size();i++)
       {
       	System.out.println(list.get(i));
       }

     // sorting

      Collections.sort(list);
      System.out.println("Sorting = "+list);

       }
}