import java.lang.*;

class Test extends Thread
{
	public void run()
	{
		System.out.println("Child Thread Old Name:"+Thread.currentThread().getName());
		Thread.currentThread().setName("Sumit");
		System.out.println("Child Thread New Name:"+Thread.currentThread().getName());
	}
	
	public void main(String[]args)
	{
		System.out.println("This is main Method");
		System.out.println("Parent Thread Old Name:"+Thread.currentThread().getName());
		Thread.currentThread().setName("Amit");
		System.out.println("Parent Thread new name : "+ Thread.currentThread().getName());
	}
	
	
		Test t1 = new Test();
		t1.start();
		
		
		Test t2 = new Test();
		t2.start();
		
		
		Test t3 = new Test();
		t3.start();
		
		Test t4 = new Test();
		t4.start();
		
		Test t5 = new Test();
		t5.start();
}