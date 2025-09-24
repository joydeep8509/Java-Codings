class Calculator
{
	//access_modifier  return_type  method_name()
	
	public void add()	//non-parameretized  method
	{
		int a=10, b=20, c;
		c = a+b;
		System.out.println("Addition : "+c);
		
	}
	
	public int sub(int a , int b)	//parameterized method
	{
		int c;
		c = a-b;
		return c;
	}
	
	public double multi(double a , double b)   //parameterized method
	{
		System.out.println("a : "+a + ",  b : " + b);
		double c;
		c = a*b;
		return c;
	}
	
	public void div(int a, int b)
	{
	
		double c;         //type casting..
		c = a/b;
		System.out.println("Division : "+c);
	}
	public double mod()
	{
		int a=13,b=7;
		double c;         //type casting..
		c = a%b;
		System.out.println("Reminder : "+c);
		return c;
	}
	
}

class Oops2
{
	public static void main(String []args)
	{
		Calculator c1 = new Calculator();
		c1.add();
		//int d=c1.sub(20 ,10);
		System.out.println("Substract : "+c1.sub(22,31));	//arguments
		System.out.println("Multiplication : "+c1.multi(16.76 , 18.65));  //arguments
		c1.div(12,5);
		double g=c1.mod();
		System.out.println("You can call it as modulo : "+g);
	}
}