//Operator Overloading...

class Abc
{
	void myMethod(int a , int b)
	{
		int c = a + b;
		System.out.println(c);
	}
	
	void myMethod(String a , String b)
	{
		String c = a + b;
		System.out.println(c);
	}

	void myMethod(double a , double b)
	{
		double c = a + b;
		System.out.println(c);
	}

	
}

class Poly2
{
	public static void main(String []args)
	{
		Abc a1 = new Abc();
		a1.myMethod(45 , 87);
		a1.myMethod("Welcome to " , "Aptech Kolkata");
		a1.myMethod(234.67 , 67.88);
	
	}
}