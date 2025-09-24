//Method Overloading...

class Calculator
{
	public void add(int a , int b)
	{
		int x = a + b;
		System.out.println("Addition 1 : " + x);
	}
	
	public void add(int a , int b , int c)
	{
		int x = a + b;
		System.out.println("Addition 2 : " + x);
	}
	
	public void add(int a , double b)
	{
		double x = a + b;
		System.out.println("Addition 3 : " + x);
	}
	
	public void add(String a , String b)
	{
		String x = a + b;
		System.out.println("Addition 4 : " + x);
	}	
}


class Poly1
{
	public static void main(String []args)
	{
		Calculator c1 = new Calculator();
		c1.add(76 , 98 , 33);
		c1.add(54 , 34);
		
		c1.add(87 , 56.65);
		c1.add("Hello" , " World");
	}
	
}