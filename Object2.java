class Car
{
	int model_number;	//state , fields, variables
	String brand;
	String color;
	int max_speed;
	int acc;
	int cc;
	int capacity ;
	
	public void speed()	//behaviour , methods
	{
		System.out.println("The highest speed of "+brand +" is "+max_speed +" km/hr");
	}
	
	public void accelaration()
	{
		System.out.println("The Accleration of "+brand +" is "+acc +" kM2");
	}
	
	public void display()
	{
		System.out.println("Car model number is " + model_number);
		System.out.println("Car brand is " + brand);
		System.out.println("Car color is " + color);
		System.out.println("Car engine CC is " + cc +" lits");
		System.out.println("Car maximum capacity is " + capacity);
	}
}

class Oops1
{
	public static void main(String []args)
	{
//syntax:class_name  obj_name  = new  class_constructor();
		
		Car  audi = new Car();		//create object through constructor
		audi.model_number = 76894;	//calling variables through object
		audi.brand = "AudiXL5";
		audi.color = "Red";
		audi.max_speed = 250;
		audi.acc = 25;
		audi.cc = 40;
		audi.capacity = 8 ;
		
		audi.display();		//calling methods through object
		audi.speed();
		audi.accelaration();
		
		System.out.println("---------------------------------");
		
		Car  bmw = new Car();
		bmw.model_number = 1557;
		bmw.brand = "BMWGoldA4";
		bmw.color = "Black";
		bmw.max_speed = 300;
		bmw.acc = 42;
		bmw.cc = 35;
		bmw.capacity = 4 ;
		
		bmw.display();
		bmw.speed();
		bmw.accelaration();
		
		System.out.println("---------------------------------");
		
		Car  tata = new Car();
		
		tata.model_number = 1007;
		tata.brand = "EV";
		tata.color = "Matgreen";
		tata.max_speed = 250;
		tata.acc = 40;
		tata.cc = 23;
		tata.capacity = 7 ;
		
		tata.display();
		tata.speed();
		tata.accelaration();
		
		
		
	}	
}