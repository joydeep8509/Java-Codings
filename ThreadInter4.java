import java.util.logging.Level;
import java.util.logging.Logger;

class Medical extends Thread
{
    public void run()
    {
        System.out.println("Person enter Medical room");
        try 
        {
            Thread.sleep(5000);
        } 
        catch (InterruptedException ex) 
        {
            System.out.println(ex);
        }
        System.out.println("Medical Done");
    }
    
}

class Driving extends Thread
{
    public void run()
    {
        System.out.println("Person enter Driving area");
        try 
        {
            Thread.sleep(7000);
        } 
        catch (InterruptedException ex) 
        {
            System.out.println(ex);
        }
        System.out.println("Driving exam Done");
    } 
}


class DocumentVerification extends Thread
{
    public void run()
    {
        System.out.println("Person enter document verification room");
        try 
        {
            Thread.sleep(6000);
        } 
        catch (InterruptedException ex) 
        {
            System.out.println(ex);
        }
        System.out.println("Documentation  Done");
    }
    
}

 class NewClass 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Medical m1 = new Medical();
        m1.start();
        
        
        m1.join();
        Driving d1 = new Driving();
        d1.start();
        
        
        d1.join();
        DocumentVerification dv = new DocumentVerification();
        dv.start();
        
    }
}