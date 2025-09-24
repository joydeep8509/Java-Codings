import java.util.*;

class Nestelse
{
	
public static void main(String[]args)
	{
	
	Scanner s= new Scanner(System.in);
	
	 int H;
	 int A;
	 int W;
	 
	System.out.println("Enter the Height"); 
	H=s.nextInt();
	System.out.println("Enter the Age"); 
	A=s.nextInt();
	System.out.println("Enter the Weight"); 
	W=s.nextInt();

	if(W<=80 && W>=50)
	{

		if(H>=166)
			{

				if(A<=27 && A>=18)
					{

				System.out.println("WELCOME ");

					}

					else
					{
				System.out.println("AGE DEFAULT");	
					}

			}

			else
				{
			System.out.println("Height DEFAULT");	
				}
			
	}

	else
	{
	System.out.println("Weight Default");	
	}
	

 
	}
}