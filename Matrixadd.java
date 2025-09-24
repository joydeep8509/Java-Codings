import java.util.Scanner;

class MatrixAddition1
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int row1, column1;
		int row2 ,column2;
		
		System.out.println("Enter 1st array row size : ");  //2
		row1 = sc.nextInt();
		
		System.out.println("Enter 1st array column size : "); //2
		column1 = sc.nextInt();
		
		System.out.println("Enter 2nd array row size : ");   //2
		row2 = sc.nextInt();
		
		System.out.println("Enter 2nd array column size : "); //2
		column2 = sc.nextInt();
		
		if(row1 != row2)
		{
			return ;
		}
		
		if(column1 != column2)
		{
			return;
		}
		
		int a[][] = new int[row1][column1];  //row=2,column=2
		int b[][] = new int[row1][column1];   //same as matrix1
		int result[][] = new int[row1][column1]; 
		
		//input the value in matrix....
		
		for(int i=0; i<row1; i++)
		{
			for(int j=0; j<column1; j++)
			{
				System.out.print("Enter value in 1st matrix :["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("----------------------------------------");
		
		for(int i=0; i<row1; i++)
		{
			for(int j=0; j<column1; j++)
			{
				System.out.print("Enter value in 2nd matrix: ["+i+"]["+j+"] :");
				b[i][j] = sc.nextInt();
			}
		}
		
		//addition of two matrix.../
		
		for(int i=0; i<row1; i++)
		{
			for(int j=0; j<column1; j++)
			{
				result[i][j] = a[i][j] + b[i][j];  //for subtraction use -
			}
		}
		
		System.out.println(" The addition of two matrix is : ");
		
		for(int i=0; i<row1; i++)
		{
			for(int j=0; j<column1; j++)
			{
				System.out.print(result[i][j] +" ");
			}
			System.out.println();
		}
		
	}
	
}