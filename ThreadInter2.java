class JavaApplication3 extends Thread
{
    public void run()  
    {
       // Thread.yield();
        for(int i=1 ; i<= 10 ; i++)
        {
            System.out.println("Child Thread : " + i);
            Thread.sleep(1000);
        }  
    }
    
    public static void main(String[] args) 
    {
        JavaApplication3 t1 = new JavaApplication3();
        t1.start();
    
        
        Thread.yield();
        
        for(int i=1 ; i<= 10 ; i++)
        {
            System.out.println("Parent Thread : " + i);
            Thread.sleep(1000);  //(millis,nano)
        }  
        
        
    }
    
}