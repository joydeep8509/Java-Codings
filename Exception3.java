import java.io.*;

class Excep
{
	public void read() throws FileNotFoundException
	{
		FileInputStream f= new FileInputStream("Abcd.txt");
	}
	
	public void write() throws FileNotFoundException
	{
		FileOutputStream f= new FileOutputStream("Abcd.txt");
	}
}

class Excep4
{
	public static void main(String[]args) throws FileNotFoundException
	{
		Excep e= new Excep();
		
		e.read();
		e.write();
		System.out.println("Successful");
	}
}