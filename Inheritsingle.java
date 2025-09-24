//Single Inheritance

class Mobile
{
	protected String name; // class param
	protected String brand;
	public int modelno;
	public String color;
	
	public void calling()
	{
		System.out.println("Mobile give the features of calling facility...");
		
	}
	
	public void sendSms()
	{
		System.out.println("In mobile, you can send sms very easily and fast...");
		
	}
	
}

class Samsung extends Mobile
{
	void setName(String name1)// local parm
	{
		this.name = name1;
	}
	void setBrand(String brand1)
	{
		this.brand = brand1;
	}
	void setModel(int modelno1)
	{
		this.modelno = modelno1;
	}
	void setColor(String color1)
	{
		this.color = color1;
	}
	
	void display()
	{
		System.out.println("Mobile name : "+ name);
		System.out.println("Mobile brand : "+ brand);
		System.out.println("Mobile model number : "+ modelno);
		System.out.println("Mobile color : "+ color);
		
	}
	
}

class Inheritance1
{
	public static void main(String []args)
	{
		Samsung s1 = new Samsung();
		
		s1.setName("Samsung S5");
		s1.setBrand("Samsung");
		s1.setModel(54321);
		s1.setColor("Black");
		
		s1.display();
		s1.calling();
		s1.sendSms();
		
	}
	
}