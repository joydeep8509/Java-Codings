import java.util.Scanner;


class Ara2
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
	
	    int [] pr;
		
		pr=new int[5];
		
	System.out.println("Enter the values:");
		
	for(int i=0;i<pr.length;i++)
	{
		System.out.println("At Index( "+i+" ):");
		pr[i]=sc.nextInt();
		
	}
	
	System.out.println("----------------Output-------------------");
	
	for(int i=0;i<pr.length;i++)
	{
		System.out.println("The value at the index( "+i+" )is : "+pr[i]);
	}
			
			
	}
}