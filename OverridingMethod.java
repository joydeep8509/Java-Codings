class Mobile
{
	public void calling()
	{
		System.out.println("Mobile give the features of calling facility...");
		
	}
	
}
class Samsung extends Mobile 
{
	@Override                ///Annotation(@)
	public void calling()
	{
		super.calling();
		System.out.println("Samsung also give the features of calling facility which is more faster...");
		
	}
	
}

class Inheritance
{
	public static void main(String []args)
	{
		Samsung s1 = new Samsung();
		
		s1.calling();
		
	}
	
}