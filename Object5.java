class Person
{
	String name;
	int roll_number;
	
	
	Person()						//non-parameterised constructor....
	{
		name = "Amit Das";//1
		roll_number = 101;
		
	}
	
	public void info()
	{
		System.out.println("Person name : " + name);
		System.out.println("Person roll number : " + roll_number);   //1
	}
	
	
	
	Person(String n , int r )	//parameterised constructor....
	{
		String name = n;
		int roll_number = r;
		
		System.out.println("Person name : " + name);
		System.out.println("Person roll number : " + roll_number);
	}
}

class Cons4
{
	public static void main(String []args)
	{
		Person p=new Person();			//1
		p.info();    					//1
		
		Person p1 = new Person("Chandan Dutta" , 12);	//arguments...
		Person p2 = new Person("Akash Kumar" , 13);					//2
		Person p3 = new Person("Riya Sen" , 14);
		Person p4 = new Person("Deepak Das" , 15);	
		
	}
}