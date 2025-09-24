class Array1
{
	public static void main(String []args)
	{
		int[][] b = { {2 , 5 , 4} , {12 } , {1 , 11 } , {6 , 7 , 9}  };
		
		 
		
		for(int i=0 ; i<b.length ; i++)
		{
			for(int j=0 ; j<b[i].length; j++)
			{
				System.out.print(b[i][j] + " ");	
			}
			System.out.println();
		}
		
		
	}
	
}