class NewClass1 extends Thread
{
    public void run()
    {
       //System.out.println(Thread.interrupted());   //true ---> false
         System.out.println(Thread.currentThread().isInterrupted());  //true --> true
        
        
        try 
        {
            for (int i = 0; i < 10; i++) 
            {
                System.out.println("Child Thread : " + i);
                Thread.sleep(1000);
            }
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }  
    }
    
    public static void main(String[] args) 
    {
        NewClass1 n1 = new NewClass1();
        n1.start();
		n1.interrupt();
    }
}