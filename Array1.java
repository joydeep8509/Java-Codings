class Arr
{
	public static void main(String []args)
	{
		
		/*int []a;
		
		a = new int[5];
		
		a[0]  =  87;
		a[1]  =  78;
		a[2]  =  82;
		a[3]  =  87;
		a[4]  =  78;*/
		
		
		int[] a = {87 , 78, 82, 87, 78}; ///or
		
		double avg;  //fraction 
		int sum = 0;
		
		for(int number:a)   ///(number=0;number<a.length;number++)
		{
			sum = sum+number;  ///sum=87+78+82...
		}
		
		// Avg calculation
		
		int arrlength = a.length; //  5
		
		avg = ((double) sum / (double) arrlength);
		
		System.out.println("Sum of array :  " + sum);
		System.out.println("Average of array : " + avg);
		
		

	}
	
}