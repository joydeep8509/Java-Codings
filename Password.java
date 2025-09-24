import java.util.*;

class Con
{
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);

	int pass;
	System.out.println("Enter the password:");
	pass=s.nextInt();

	if(pass==1234)
	{
		System.out.println("welcome");
	}
	else
	{
		System.out.println("wrong password");
	}
}

}