import java.lang.*;

class Test1 extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread...");    //true
		}
		else
		{
			System.out.println("Child Thread...");    //false
		}
	}

	public static void main(String []args)
	{
		System.out.println("Main Thread...");
		
		Test1 t1 = new Test1();
		t1.setDaemon(true);
		t1.start();
		
	}
}