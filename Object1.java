class Adv
{
	int add(int a ,int b)
	{
		int c=a+b;
		
		return c;
	}
	int sub(int a ,int b)
	{
		int c=a-b;
		
		return c;
	}
	
	
}
class Calling
{
	public static void main(String[]args)
	{
		Adv h=new Adv();
		
		System.out.println("The value is(h): "+h.add(20,50));
		System.out.println("The value is(h) :"+h.sub(50,20));
		
		Adv h1=new Adv();
		
		System.out.println("The value is(h1) :"+h1.sub(5,3));
		
		Adv h2=new Adv();
		
		System.out.println("The value is (h2):"+h2.add(10,15));
		
		Adv h3=new Adv();
		
		System.out.println("The value is (h3):"+h3.sub(150,55));
		
		
	}
	
	
}