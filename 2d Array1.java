class Array4
{
	public static void main(String []args)
	{
		int[][] a = { {12 , 15 , 14} , {12 , 23 , 13} , {11 , 15 , 17} , {16 , 17 , 19}  }; 
	
		
		System.out.println("Row  size : " + a.length);    // number of row
		System.out.println("column1 size : " + a[1].length+"\n");  // number of column
		
		System.out.println("The Matrix is:-");
		
		
		for(int i=0 ; i<a.length ; i++)  //4 number of rows
		{
			for(int j=0 ; j<a[i].length; j++)   //3  number of columns.
			{
				System.out.print(a[i][j] + " ");	
			}
			System.out.println("");
		}
		
		
	}
	
}