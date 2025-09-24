import java.lang.*;

class Test extends Thread
{
	public void run()
	{
		System.out.println("Java Multithreading concept...");
		System.out.println("This is Java CLass...");
		System.out.println("Thread is going to be executed....");
	}
	
}

class Test1 extends Thread
{
	public void run()
	{
		System.out.println("Java Multithreading concept...!");
		System.out.println("This is Java CLass...!");
		System.out.println("Thread is going to be executed....!");
	}
	
}
class Multi1 extends Thread
{
	public static void main(String []args)
	{
		Test  t1 = new Test();
		//t1.run();
		t1.start();
		Test  t2 = new Test();
		//t2.run();
		t2.start();
		
		Test1  t3 = new Test1();
		//t3.run();
		t3.start();
		Test1  t4 = new Test1();
		//t4.run();
		t4.start();
		
	}
	
}