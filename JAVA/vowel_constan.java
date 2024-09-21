import java.util.*;
class vowel_constan
{
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.print("Enter a string=");
        s =sc.nextLine();
        s = s.toUpperCase();

         int vowel=0;
         int cons=0;

        for(int i=0;i<s.length();i++)
        {
        	char c=s.charAt(i);

            if(c != ' ')
            {
             if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        	 {
        			vowel++;
        	 }
        	 else
        	 {
        		 cons++;
        	 }
            }
        }
        System.out.println("Vowel is = "+vowel+"\nConstant is = "+cons);
	}
}