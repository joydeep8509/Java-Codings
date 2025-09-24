import java.util.Scanner;

class Palin
{

public static void main(String[]args)    
	{    
	Scanner s=new Scanner(System.in);
	
	int n,r,temp; 
	int sum=0;   
	System.out.println("enter the number="); 
	   
	n=s.nextInt();			 //n=123
	   
	temp=n;     			//temp=123
	    
	while(n>0)    
	{    
		r=n%10;  			// 3->2-> 1
		sum=(sum*10)+r;  	//sum=3->32->321
		n=n/10; 			//12.3-> 1.2-> 0.1
	}   
	if(temp==sum)  			//121==121  
	System.out.println("palindrome number ");    
	else    
	System.out.println("not palindrome : "+sum);   //reverse of a number
 
	}   
}