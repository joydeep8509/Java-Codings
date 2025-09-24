import java.util.scanner

class matrixadd
{
public static void main(string[]args)
	{
	Scanner sc=new Scanner(System.in);

	int row1,column1;
	int row2,column2;

	System.out.println("Enter 1st row size:");
	row1=sc.nextInt();

	System.out.println("Enter 1st column size:");
	column1=sc.nextInt();

	System.out.println("Enter 2nd row size:");
	row2=sc.nextInt();

	System.out.println("Enter 2nd column size:");
	column2=sc.nextInt();

	if(row1 !=row2)
	{
	return;
	}
	if(column1 !=column2)
	{
	return;
	}

	int a[][]= new int [row1][column1];
	int b[][]= new int [row1][column1];
	int result[][]= new int [row1][column1];

	for(int i=0;i<row1;i++)
	{
	for(int j=0;j<column1;j++)
	{
	System.out.print("Enter value in 1st matrix:["+i+"]["+j+"]:");
	a[i][j]=nextInt();
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

	for(int i=0;i<row1;i++)
	{
	for(int j=0;j<column1;j++)
	{
	result[i][j]=a[i][j]+b[i][j];
	}
	}
	System.out.println(" The addition of two matrix is : ");

	for(int i=0;i<row1;i++)
	{
	for(int j=0;j<column1;j++)
	{
	System.out.print(result[i][j]+" ");
	}
	System.out.print();
	}
	}
}
	