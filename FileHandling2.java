import java.io.*;
import java.nio.file.*;
import java.util.List;

class PracticeNio
{
	public void fileinfo() throws IOException
	{
		Path p1 = Paths.get("C:\\FileHandling\\Super1.txt");
		System.out.println(p1.isAbsolute());
		System.out.println(p1.getFileName());
		System.out.println(p1.toAbsolutePath());
		System.out.println(p1.getRoot());
		System.out.println(p1.getNameCount());
		System.out.println(p1.toString());	
	}
	
	public void createFolder() throws IOException
	{
		Path p1 = Paths.get("C:\\FileHandling\\NIIT");
		if(Files.exists(p1))
		{
			System.out.println("Directory already exists...");
		}
		else
		{
			Path p2 = Files.createDirectory(p1);
			System.out.println("Directory created successfully...");
		}	
	}
	
	public void createFiles() throws IOException
	{
		Path p1 = Paths.get("C:\\FileHandling\\NIIT\\Abc.txt");
		if(Files.exists(p1))
		{
			System.out.println("File already exists...");
		}
		else
		{
			Path p2 = Files.createFile(p1);
			System.out.println("File created successfully...");
		}
			
	}
	
	public void writeFile() throws IOException
	{
		Path p1 = Paths.get("C:\\FileHandling\\NIIT\\Xyz.txt");
		String content = "NIIT Limited is an Indian multinational skills and talent development corporation headquartered in Gurgaon, India. The company was set up in 1981 to help the nascent IT industry overcome its human resource challenges. NIIT offers training and development to individuals, enterprises and institutions.";
		
		//String content="Hello , Friends chay pilo";  //2
		
		Files.write(p1 , content.getBytes());
		System.out.println("File write successfully...");
	}
	
	public void readFile() throws IOException
	{
		Path p1 = Paths.get("C:\\FileHandling\\NIIT\\Xyz.txt");
		List<String> l1 = Files.readAllLines(p1);   //generics type...
		
		for(String line : l1)
		{
			System.out.println(line);
		}
		System.out.println("\nFile read successfully...");
	}
	
	public void copyFile() throws IOException
	{
		Path p1 = Paths.get("C:\\FileHandling\\NIIT\\Xyz.txt");
		Path p2 = Paths.get("C:\\FileHandling\\NIIT\\Spd.txt");
		Files.copy(p1 , p2 , StandardCopyOption.REPLACE_EXISTING);
		
		
		System.out.println("\nFile copy successfully...");
	}
	
	public void moveFile() throws IOException
	{
		Path p1 = Paths.get("C:\\FileHandling\\NIIT\\Xyz.txt");
		Path p2 = Paths.get("C:\\FileHandling\\NIIT\\Neu.txt");
		Files.move(p1 , p2 , StandardCopyOption.REPLACE_EXISTING);
		
		
		System.out.println("\nFile moved successfully...");
	}
	
	public void appenedFile() throws IOException
	{
		Path p1 = Paths.get("C:\\FileHandling\\NIIT\\Neu.txt");
		String content = "\nNIIT was established in 1981 by Rajendra S. Pawar and Vijay K. Thadani, graduates from IIT[4] Delhi, with one million rupees. NIIT conceived a franchising model in IT education for the very first time, setting up nine centers by 1987.";
		Files.write(p1 , content.getBytes() , StandardOpenOption.APPEND);
		
		System.out.println("\nFile write(append) successfully...");
	}
	
	public void deleteFile() throws IOException
	{
		Path p1 = Paths.get("C:\\FileHandling\\NIIT\\Neu.txt");
		Files.delete(p1);
		
		System.out.println("\nFile delete successfully...");
	}
	public void deleteFolder() throws IOException
	{
		Path p1 = Paths.get("C:\\FileHandling\\NIIT");
		Files.delete(p1);
		
		System.out.println("\nFile delete successfully...");
	}
}

class NioPractice2
{
	public static void main(String []args)
	{
		PracticeNio pn1 = new PracticeNio();
		try
		{
			//pn1.fileinfo();
			//pn1.createFolder();
			//pn1.createFiles();
			//pn1.writeFile();
			//pn1.readFile();
			//pn1.copyFile();
			//pn1.moveFile();
			//pn1.appenedFile();
			//pn1.deleteFile();
			pn1.deleteFolder();
		}
		catch(Exception e)
		{
			System.out.println("Exception handeled : "+e);
		}
		
	}
	
}