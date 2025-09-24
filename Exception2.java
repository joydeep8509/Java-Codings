class Excep1
{
	public static void main(String []args)
	{
		int a = 100, b =10 , c;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception handeled");
		}
		finally
		{
			System.out.println("This is the finally block....");
		}
		
	}
	
}