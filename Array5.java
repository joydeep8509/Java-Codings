import java.util.Scanner;

class JavaClass8
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st array size :  ");
		int arrsize1 = sc.nextInt();
		
		System.out.println("Enter 2nd array size :  ");
		int arrsize2 = sc.nextInt();
		
		if(arrsize1 != arrsize2)
		{
			System.out.println("Both size will be same....");
			return;
		}
		
		int arr1[] = new int[arrsize1];      //arrsize2
		int arr2[] = new int[arrsize1];
		int sum[] = new int[arrsize1];
		
		System.out.println("Enter 1st array value : ");
		
		for(int i=0; i<arr1.length; i++)   //5
		{
			arr1[i] = sc.nextInt();  //10,20,30,40,50
		}
		
		System.out.println("Enter 2nd array value : ");
		
		for(int i=0; i<arr1.length; i++)
		{
			arr2[i] = sc.nextInt();//11,22,33,44,55
		}
		
		for(int i=0; i<sum.length; i++)
		{
			sum[i] = arr1[i] + arr2[i];//-
		}
		
		System.out.println("Display the addition value : ");
		
		for(int a=0; a<sum.length; a++)
		{
			System.out.print(sum[a] + "  ");
		}
	}
	
}