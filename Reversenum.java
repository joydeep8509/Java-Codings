import java.util.*;
 import java.lang.Math;

class Rev
{
public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);

		int n,r,temp;
		int sum=0;
		System.out.println("enter the number=");

		int n=s.nextInt();
	
		temp=n;

		while(n>0)
		{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		}

	}
}