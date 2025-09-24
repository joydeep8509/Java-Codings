interface Engine
{
	void speed(int a); 	
	void acc(int b);  	///by default abstract
	
}

class Vehicle implements Engine
{
	int speed;  
	int acc;  
	
	public void speed(int a)			 
	{
		this.speed = a;  				
		System.out.println("Vehical speed : " + speed + " km/h");
	 }
	
	public void acc(int b)				 
	{
		this.acc = b; 					
		System.out.println("Vehical acceleration : " + acc + " nm");
	}
}

class Inter7
{
	public static void main(String []args)
	{
	
		Vehicle v1 = new Vehicle();
		v1.speed(130);
		v1.acc(25);
	}
}