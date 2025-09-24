//Hierharical Inheritance

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
	
	
	void display1()
	{
		System.out.println("Samsung name : "+ name);
		System.out.println("Samsung brand : "+ brand);
		System.out.println("Samsung model number : "+ modelno);
		System.out.println("Samsung color : "+ color);
		
	}	
}

class Nokia extends Mobile
{
	void setNokName(String name2)
	{
		this.name = name2;
	}
	void setNokBrand(String brand2)
	{
		this.brand = brand2;
	}
	void setNokModel(int modelno2)
	{
		this.modelno = modelno2;
	}
	void setNokColor(String color2)
	{
		this.color = color2;
	}
	
	void display2()
	{
		System.out.println("Nokia name : "+ name);
		System.out.println("Nokia brand : "+ brand);
		System.out.println("Nokia model number : "+ modelno);
		System.out.println("Nokia color : "+ color);
		
	}	
	
}

class Inheritance3
{
	public static void main(String []args)
	{
		Samsung s1 = new Samsung();
		s1.setName("SamsungS5");
		s1.setBrand("Samsung");
		s1.setModel(1234);
		s1.setColor("Black");
		
		s1.display1();
		s1.calling();
		s1.sendSms();
		
		System.out.println("--------------------------------");
		
		Nokia n1 = new Nokia();
		
		n1.setNokName("NokiaA15");
		n1.setNokBrand("Nokia");
		n1.setNokModel(234);
		n1.setNokColor("Blue");
		
		n1.display2();
		n1.calling();
		n1.sendSms();
		
	}
	
}