import java.util.*;

class Con
{
	public static void main(String[]args)
	{
	Scanner s= new Scanner(System.in);
	
	int roll;
	
	System.out.println("Enter the rollnumber");
	roll=s.nextInt();

	if(0<roll && roll<=50)
	{
	system.out.println("welcome to block A");
	}
	else if(50<roll && roll<=100)
	{
	sysytem.out.println("welcome to block B");
	}
	else if(100<roll && 150<=roll)
	{
	system.out.println("Welcome to block C");
	}
	else if(150<roll && 200<=roll)
	{
	system.out.println("Welcome to block D");
	}

	else
	{
	system.out.println("Error");
	}
	}
}
