class Array4
{
	public static void main(String[]args)
	{
		int [][]b={{2,5,4},{1,3,5},{1,3,9}};
		
		int [][]c={{2,5},{1,3}};
		
		
		for (int i=0;i<b.length;i++)
		{
			for (int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("---------------------------------- ");
		
		for (int i=0;i<c.length;i++)
		{
			for (int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}