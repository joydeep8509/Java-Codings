class YoungerAgeException extends RuntimeException 
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}

class Excep5
{
	public static void main(String []args)
	{
		int age =17;
		
		try
		{
			if(age<18)
			{
				throw new YoungerAgeException("You are not eligible for voting...");
			}
			else
			{
				System.out.println("You are eligible for voting...");
			}
		}
		catch(YoungerAgeException y1)
		{
			System.out.println(y1);
		}
		
		System.out.println("Complete.....");
	}
	
}