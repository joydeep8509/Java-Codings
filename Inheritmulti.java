//Multilevel Inheritance

class Mobile
{
	public String name;
	public String brand;
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
	String sam_name;
	int sam_model;
	String sam_brand;
	String sam_color;
	
	void setName(String name1)
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

class Samsung543 extends Samsung
{
	void setSamName(String name2)
	{
		this.sam_name = name2;
	}
	void setSamBrand(String brand2)
	{
		this.sam_brand = brand2;
	}
	void setSamModel(int modelno2)
	{
		this.sam_model = modelno2;
	}
	void setSamColor(String color2)
	{
		this.sam_color = color2;
	}
	
	void display1()
	{
		System.out.println("Samsung name : "+ sam_name);
		System.out.println("Samsung brand : "+ sam_brand);
		System.out.println("Samsung model number : "+ sam_model);
		System.out.println("Samsung color : "+ sam_color);
		
	}	
	
}

class Inheritance2
{
	public static void main(String []args)
	{
		Samsung543 s1 = new Samsung543();
		
		s1.setName("Samsung");
		s1.setBrand("Samsung");
		s1.setModel(1234);
		s1.setColor("Black");
		
		s1.setSamName("SamsungS3");
		s1.setSamBrand("Samsung");
		s1.setSamModel(5467);
		s1.setSamColor("Blue");
		
		s1.display();   //child   //Samsung
		s1.display1();   // grand child Samsung543
		s1.calling();    //mobile
		s1.sendSms();	//mobile
		
	}
	
}