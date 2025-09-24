import java.util.*;
 import java.lang.Math;  // math pow
 
 
 class Armst
 {

    public static void main(String[] args)
	{

        int number , originalNumber, remainder, result = 0,Times=0;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		number = s.nextInt();			//153

        originalNumber = number;		//Or=153
		
		while ( originalNumber != 0) 
		{
		Times = Times + 1;							// Times=3
		originalNumber =  originalNumber / 10;		//15.3,1.5,0.1
		}
		
		originalNumber = number; 					//0->153
		
        while (originalNumber != 0)					// only for 3 figure numbers
        {
            remainder = originalNumber % 10;		//3  5   1
            result += Math.pow(remainder, Times);	//result=0+27+125+1=153
            originalNumber= originalNumber /10;		//15.3  1.5  0.1
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number."+result);
    }
}