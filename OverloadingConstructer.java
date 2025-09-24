class Student 
 {  
  
	int id;  
	String name;  
  
		Student()
			{  
		System.out.println("This  is a default constructor");  
			}  
  
		Student(int i, String n)
			{  
			id = i;  
			name = n;  
			}  
}  
class Call
{
	public static void main(String[] args) 
			{  
		Student se = new Student();
		Student s = new Student(2,"anuj"); 
		
		System.out.println("\nDefault Constructor values: \n");  
		System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
  
	System.out.println("\n---------:Parameterized Constructor values:-------:");  
	Student student = new Student(10, "David");  
	System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
			} 
}