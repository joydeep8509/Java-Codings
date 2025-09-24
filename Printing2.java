import java.util.*;

class Sc
	{
	public static void main(String[]args)
	{
	
	Scanner sc= new Scanner(System.in);

	String d;
	float a;
	int b;
	char c;

	System.out.println("Enter your Values");

	d=sc.nextLine();
	b=sc.nextInt();
	a=sc.nextFloat();
	c=sc.next().charAt(0);

	System.out.println("The value of a:"+a);
	System.out.println("The value of c:"+c);
	System.out.println("The value of b:"+b);
	System.out.println("The value of d:"+d);
	}
	}