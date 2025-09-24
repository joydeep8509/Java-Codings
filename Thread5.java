import java.lang.*;
class TestA extends Thread
{
	public void run()
	{
		Thread.currentThread().setPriority(3);
		System.out.println("Priority of child : " + Thread.currentThread().getPriority());
	}

}
class TestB extends Thread
{
	public void run()
	{
		Thread.currentThread().setPriority(1);
		System.out.println("Priority of child : " + Thread.currentThread().getPriority());
	}
}

class TestC extends Thread
{
	public void run()
	{
		Thread.currentThread().setPriority(4);
		System.out.println("Priority of child : " + Thread.currentThread().getPriority());
	}

	public static void main(String []args)
	{
		System.out.println("Main Thread...");
		Thread.currentThread().setPriority(2);
		System.out.println("Priority of main : " + Thread.currentThread().getPriority());
		
		TestA tA = new TestA();
		tA.start();
		TestB tB = new TestB();
		tB.start();
		TestC tC = new TestC();
		tC.start();
		
	}
}