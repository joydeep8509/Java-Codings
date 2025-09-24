import java.util.Scanner;
 
class MatrixMulti
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);//sc is object of Scanner class
		int row1,column1;
		int row2,column2;
		System.out.println("Enter 1st array row size:");
		 row1=sc.nextInt();
		 System.out.println("Enter 1st array column size: ");
		 column1=sc.nextInt();
		 System.out.println("Enter 2nd array row size:");
		 row2=sc.nextInt();
		 System.out.println("Enter 2nd array column size: ");
		 column2=sc.nextInt();
		 if(row1!=row2)
			{
			return;	
			}
		if(column1!=column2)
			{
			return;	
			}
		int a[][]=new int [row1][column1];
		int b[][]= new int[row1][column1];
		int	result[][]=new int [row1][column1];
		for(int i=0;i<row1;i++)					//0
		{
			for(int j=0;j<column1;j++)		//(0,0),(0,1)//(1,0),(1,1)
			{
				System.out.print("Enter the 1st matrix: ");
				a[i][j]=sc.nextInt();
			}
		}	
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				System.out.print("Enter the 2nd matrix: ");
				b[i][j]=sc.nextInt();
				
			}
		}
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
                   for(int k=0;k<column1;k++)  
                     {
					result[i][j]+=a[i][k]*b[k][j];
                     }
				}
			}
			System.out.println("Display the multiplication of two matrixs  :   ");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					System.out.print(result[i][j]+"  ");
				}
				System.out.println();
			}
		}
	}