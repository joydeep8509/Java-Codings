import java.util.Scanner;

class Prime1
{
	public static void main(String[]args)
	{
		int flag=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number:");
		
		int P=sc.nextInt();    //7   //p/2
		
		for (int i=2;i<=(P-1);i++)   //i<6   
		{
			if (P%i==0)
			{
				flag=flag+1;
			}		
		}
		if(flag>0)
		{
			System.out.println("the number is not prime......");
		}
		else
		{
			System.out.println("the number is  prime......");
		}
		
	}
}