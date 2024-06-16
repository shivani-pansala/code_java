class Cmd2
{
	public static void main(String[] args)
    {
    	if(args.length>=2)
    	{
		byte no1= Byte.parseByte(args[0]);
		byte no2=Byte.parseByte(args[1]);
		System.out.println("Addition:"+(no1+no2));
	    }
    	else
    	{
		System.out.println("plz provide argument");
    	}
    }
}

