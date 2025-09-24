public class Ex 
{
    protected void project()
    {
        System.out.println("I am from java_practice Package .....!");
    }
    
}import java_practice.Ex;

public class NewClass1 extends Ex
{
    public static void main(String []args)
    {
        NewClass1 n = new NewClass1();
        n.project();
    }
}