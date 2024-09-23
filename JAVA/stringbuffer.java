class stringbuffer
{
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Helloworld");

		//print value
		System.out.println(str);

		//set value
		str.setCharAt(3,'o');
		System.out.println(str);

		//append value
		StringBuffer str2 = new StringBuffer("GoodMorning");
		str.append(str2);
		System.out.println(str);

		//insert value
		str.insert(5,str2);
		System.out.println(str);
	}
}