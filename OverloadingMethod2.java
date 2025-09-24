// Java program to demonstrate the working of method
// overloading by changing the Datatype of parameter

class MethodOverloading2
{

	
	static void show(int a, int b)
	{
		System.out.println("This is integer function ");
	}

	
	static void show(double a, double b)
	{
		System.out.println("This is double function ");
	}

	public static void main(String[] args)
	{
		
		show(1, 2);
	
		
		show(1.2, 2.4);
	}
}