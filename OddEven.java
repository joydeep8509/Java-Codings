import java.util.*;

class Odd
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);

	System.out.println("Enter your number");
	int n=s.nextInt();

	if(n%2==0)
    		{
        	System.out.println("Your number is even");
    		}
    		else
    		{
        	System.out.println("Your number is odd");
    		}
	}

}