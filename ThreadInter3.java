import java.util.logging.Level;
import java.util.logging.Logger;

class JavaApplication4 extends Thread
{
    static Thread th;
    
    public void run()
    {
        try 
        {
            th.join();   //2
            for (int i = 0; i < 10; i++) 
            {
                System.out.println("Child Thread : " + i);
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException ex) 
        {
            System.out.println(ex);
        }
        
        
    }
   
    public static void main(String[] args) throws InterruptedException 
    {
        th = Thread.currentThread();
        
        
        JavaApplication4 a = new JavaApplication4();
        a.start();
       //a.join();  //1
        
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Main Thread : " + i);
            Thread.sleep(1000);
        }
		
    }
}
/*Join method in Java allows one thread to wait until another thread completes 
its execution. In simpler words, it means it waits for the other 
thread to die*/