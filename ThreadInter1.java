class JavaApplication2 extends Thread
{
    public void run()  
    {
	try
		{
            for(int i=1 ; i<= 10 ; i++)
            {
		System.out.println("Child Thread : " + i);
		Thread.sleep(1000 , 45);
            }
	}
	catch(Exception ie)
	{
            System.out.println(ie);
	}
    }
    public static void main(String[] args) throws InterruptedException 
    {
       
        for(int i=1 ; i<= 10 ; i++)
        {
            System.out.println("Main Thread : " + i);
            Thread.sleep(1000 , 45);
        }
	
       JavaApplication2 t3 = new JavaApplication2();
      //t3.start();
	   t3.run();
       
       JavaApplication2 t4 = new JavaApplication2();
      // t4.start();
	  t4.run();
    }
    
}