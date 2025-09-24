import java.util.Scanner;

	class Fibonacci
	{  
		public static  void main( String[]args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the count:");
			
			int count =sc.nextInt();//7
			
			int	first=0,second=1,sum=0;
			
			for(int i=0 ; i<count ; i++)
			{
				if(i <= 1)
				{
				sum=i;     //sum=0  1
				}
									//to print 0 and 1
			else
			{
			sum=first + second; //sum=1 2 3 5 8
			first=second;		//first=1 1 2 3  5
			second=sum;	   		// second=1 2 3 5 8
	
			}
		System.out.print(" "+sum);   //  0   1  1  2 3 5 8
		}
		
	}	
}