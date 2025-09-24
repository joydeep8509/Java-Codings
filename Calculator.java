import java.util.*;

class Cal
{
	public static void main(String[] args)
	{
	// Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter first value:");
	float num1 =sc.nextFloat();

	System.out.println("Enter second value:");
	float num2 =sc.nextFloat();

	System.out.println("Enter your choice:(+,-,*,/,%):");
	char operator =sc.next().charAt(0);

	switch(operator)
		{
			case '+' :
						System.out.println("Addition : " + (num1 + num2));
						break;
						
			case '-' :
						System.out.println("Substraction : " + (num1 - num2));
						break;			
			
			case '*' :
						System.out.println("Multiplecation : " + (num1 * num2));
						break;			
			
			case '/' :
						System.out.println("Division : " + (num1 / num2));
						break;			
						
			case '%' :
						System.out.println("Reminder : " + (num1 % num2));
						break;	


			default :
						System.out.println("Error ! Wrong Input...");
							
						
		}
		
	}
}