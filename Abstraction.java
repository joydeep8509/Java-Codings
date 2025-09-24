abstract class Car
{
	void type()
	{
		
		System.out.println("Car is of A class");
	}
	abstract void company();  
	abstract void colour();	
	
}
class Bmw extends Car
{
	void company()
	{
		System.out.println("company:Bmw");		
	}
	void colour()
	{
		System.out.println("Car Colour: Blue");
	}
	
}
class Audii extends Car
{
	void company()
	{
		System.out.println("company:Audii");
		
	}
	void colour()
	{
		System.out.println("Car Colour: MatRed");
	}
	
}
class CarCall
{
	public static void main(String []args)
	{
		System.out.println("-----------Bmw--------------");
		Car c= new Bmw();
		c.company();
		c.colour();
		c.type();
		
		System.out.println("------------Audii------------");
		Car c1= new Audii();
		c1.company();
		c1.colour();
		c1.type();
		
		
	}
		
}