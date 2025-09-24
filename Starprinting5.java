import java.util.Scanner ;

class Main
 {
	 public static void main(String [] args)
	 {
		 Scanner s= new Scanner(System.in);

		 System.out.println("Enter the Number of Rows:");

		 int a = s.nextInt();

		 int b=a-1;

		 int c=b/2;


		for(int i=0; i<a; i++)
		{
			for(int j=0; j<a; j++)
			{
				if((i==j)||(i==c||j==c)||((i+j)==b))

					System.out.print("*");

				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
