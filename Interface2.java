interface Mobile
{
	void sendMessage();
}

interface Telephone
{
	void calling();
}

class Samsung implements Mobile , Telephone
{
	public void sendMessage()
	{
		System.out.println("Samsung gives the messaging facility to communicate each other");
	}
	
	public void calling()
	{
		System.out.println("Samsung gives the calling facility to communicate each other");
	}
	
	public void camera() // non-abstract
	{
		System.out.println("Samsung camera is very good");
	}
}

class Inter8
{
	public static void main(String []args)
	{
		Samsung s1 = new Samsung();
		s1.camera();
		s1.calling();
		s1.sendMessage();
	}
	
}