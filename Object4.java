class Abc
{
	int i;		//default AM...
	
	void display1()	//default AM...
	{
		System.out.println("Default I value is : "+i);
	}
	
	public int j;		//public AM
	
	public void display2()    //public AM
	{
		System.out.println("Public J value is : "+j);
	}
	
	protected int k;           //protected AM
	
	protected void display3()  //protected AM
	{
		System.out.println("Protected K value is : "+k);
	}
	
	private int l ;
	
	//getter method..
	public int getL()
	{
		return l;
	}
	
	//setter method...
	public void setL(int l) // perameterised function
	{
		this.l = l;
	}
}

class Am2
{
	public static void main(String []args)
	{
		Abc  a1 = new Abc();
		
		a1.i = 4;
		a1.display1();
		a1.j = 10;
		a1.display2();
		a1.k=14;
		a1.display3();
		a1.setL(25);
		System.out.println("Private L value is : "+ a1.getL());
		
		
		System.out.println("----------------------------------------------------");
		
		Abc  a2 = new Abc();
		
		a2.i = 11;
		a2.display1();
		a2.j = 23;
		a2.display2();
		a2.k=36;
		a2.display3();
		a2.setL(45);
		System.out.println("Private L value is : "+ a2.getL());
		
		System.out.println("----------------------------------------------------");
		
		Abc  a3 = new Abc();
		
		a3.i = 22;
		a3.display1();
		a3.j = 27;
		a3.display2();
		a3.k=56;
		a3.display3();
		a3.setL(51);
		System.out.println("Private L value is : "+ a3.getL());
		
		
	}
	
}