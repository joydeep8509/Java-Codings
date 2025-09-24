class Pattern     
{
	void pattern1() 
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<5; j++)  
			{
				System.out.print("*");	
			}
			System.out.println();
		}
	}
	
	void pattern2()
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++) //j==i//j<i
			{
				System.out.print("*");	
			}
			System.out.println();
		}
	}
	
	void pattern3()
	{
		for(int i=0; i<5; i++)
		{
			for(int j=5-1; j>=i; j--)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	
	void pattern4()
	{
		for(int i=0; i<5; i++)
		{
			for(int j=5-1; j>=i; j--) 
			{
				System.out.print(" ");	
			}
			for(int k=0; k<i; k++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	
	void pattern5()
	{
		for(int i=1; i<=20; i++)
		{
			for(int j=20-1; j>=i; j--)
			{
				System.out.print(" ");	
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	
	void pattern6()
	{
		int n=5;
		int a = n;  //5
		int b = n;   //5
		for(int i=1; i<=n; i++) //5
		{
			for(int j=1; j<n*2; j++) //j<10/j=9
			{
				if(j>=a && j<=b)
				{
					System.out.print("*");	   /// add space and will find another triangle
				}
				else
				{
					System.out.print(" ");
				}
			}
			a--;//5 4 3 2 1
			b++;//5 6 7 8 9
			System.out.println();
		}
		
	}
	
	void pattern7()
	{
		int n=5;
		int a = 1;
		int b = n*2-1;
		for(int i=1; i<=n; i++) //n=5
		{
			for(int j=1; j<n*2; j++)// j<10/j<=9
			{
				if(j>=a && j<=b)  //j>=1/j<=9
				{
					System.out.print("@");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			a++;
			b--;
			System.out.println();
		}
		
	}
	
	void pattern8()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				 if(i<j)
				 {
					System.out.print(" # "); 
				 }
				 else
				 {
					 System.out.print(" * ");	 
				 }
			}
			System.out.println("\n");		
		}
		
	}
	
	void pattern9()
	{
		int n=5;
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=n; j++)
			{
				
				 if(i<j)
				 {
					System.out.print("*"); 
				 }
				 else
				 {
					 System.out.print(j);	 
				 }
			}
			System.out.println();	 
		}
		
	}
}

class Pat
{
	public static void main(String []args)
	{
		Pattern p1 = new Pattern();// object p1 is created for the Pattern class
		
		//p1.pattern1();
		//p1.pattern2();
		//p1.pattern3();
		//p1.pattern4();
		//p1.pattern5();
		p1.pattern6();
		//p1.pattern7();
		//p1.pattern8();
		//p1.pattern9();
		
	}
	
}