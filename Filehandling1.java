import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//import java.io.*; 

class FileHandeled
{
	public void createFile() throws FileNotFoundException, IOException
	{
		File f1 = new File("C:\\FileHandling\\Niit.txt");
		
		if(f1.createNewFile())
		{
			System.out.println("File created successfully...");
		}
		else
		{
			System.out.println("File already exists...");
		}
	}
	
	public void fileInfo() throws FileNotFoundException, IOException
	{
		File f1 = new File("C:\\FileHandling\\Niit.txt");
		if(f1.exists())
		{
			System.out.println("File Name : "+ f1.getName());
			System.out.println("File Path : "+ f1.getAbsolutePath());
			System.out.println("File Size : "+ f1.length());
			System.out.println("File Readble : "+ f1.canRead());
			System.out.println("File Writtble : "+ f1.canWrite());
		}
		else
		{
			System.out.println("File Not Found...");	
		}
		
	}
	
	public void fileWrite() throws FileNotFoundException, IOException
	{
		FileWriter fw1 = new FileWriter("C:\\FileHandling\\Niit.txt");
		fw1.write("NIIT Limited is an Indian multinational skills and talent development corporation headquartered in Gurgaon, India. ");
		//fw1.write("Jay MataDi..." );
		
		fw1.flush();
		fw1.close();
		System.out.println("File Write successfully...");
	}
	
	public void fileRead() throws FileNotFoundException, IOException
	{
		FileReader fd1 = new FileReader("C:\\FileHandling\\Niit.txt");
		int i;
		while((i = fd1.read())!= -1)	//EndOfFile
		{
			System.out.print((char)i);  //type casting int to char
		}
		fd1.close();
		System.out.println("\nFile read successfully...");
	}
	
	public void bufferedFileWrite() throws FileNotFoundException, IOException
	{
		FileWriter fw1 = new FileWriter("C:\\FileHandling\\Niit.txt");
		BufferedWriter bw = new BufferedWriter(fw1);
		bw.write("NIIT was established in 1981 by Rajendra S. Pawar and Vijay K. Thadani, graduates from IIT[4] Delhi, with one million rupees. NIIT conceived a franchising model in IT education for the very first time, setting up nine centers by 1987.");
		bw.flush();
		bw.close();
		System.out.println("File Write successfully...");
	}
	
	public void bufferedFileRead() throws FileNotFoundException, IOException
	{
		FileReader fd1 = new FileReader("C:\\FileHandling\\Niit.txt");
		BufferedReader br = new BufferedReader(fd1);
		String i;
		while((i = br.readLine())!= null)	//EndOfFile
		{
			System.out.print(i);  
		}
		br.close();
		System.out.println("\nFile read successfully...");
	}
	
	public void renameFile() throws FileNotFoundException, IOException
	{
		File f1 = new File("C:\\FileHandling\\Niit.txt");
		File f2 = new File("C:\\FileHandling\\Super.txt");
		System.out.println(f1.renameTo(f2)); 				//true
		System.out.println("File rename successfully...");
		
	}
	
	public void copyFile() throws FileNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\FileHandling\\Super.txt");
		FileOutputStream fos = new FileOutputStream("C:\\FileHandling\\Aptech.txt");
		int i;
		while((i = fis.read())!= -1)	
		{
			fos.write((char)i);  
		}
		fis.close();
		fos.close();
		System.out.println("File copy successfully...");
	}
	
	public void appenedFile() throws FileNotFoundException, IOException
	{
		FileWriter fw1 = new FileWriter("C:\\FileHandling\\Super1.txt" , true);
		fw1.write("\nIn 2004, NIIT sectioned off its software business into an independent organization called NIIT Technologies Ltd. (Source: NASSCOM's 2013–14 Ranking of Top 20 IT services companies).");
		fw1.flush();
		fw1.close();
		System.out.println("File Write (appened) successfully...");
	}
	
	public void byteFileWrite() throws FileNotFoundException, IOException
	{
		FileOutputStream fos = new FileOutputStream("C:\\FileHandling\\Super.txt");				//FOS indivisual.
		String data = "The 2024 Indian Premier League, also known as IPL 17 or, for sponsorship reasons, Tata IPL 2024,[2] is the seventinth season of the Indian Premier League (IPL), a professional Twenty20 cricket league established by the Board of Control for Cricket in India (BCCI) in 2007. The tournament is being played from 26 March 2022, and to be concluded with the final on 29 May 2022. The group stage of the tournament is being played entirely in the state of Maharashtra, with Mumbai and Pune hosting the matches.[3] The full schedule of the tournament was announced on 6 March 2022.[4]";
		
		byte a[] = data.getBytes();
		fos.write(a);
		fos.close();
		
		System.out.println("File Write successfully...");
	}
	
	public void bytefileRead() throws FileNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\FileHandling\\Super.txt");
		int i;
		while((i = fis.read())!= -1)	
		{
			System.out.print((char)i);  
		}
		fis.close();
		System.out.println("\nFile read successfully...");
	}
	
	public void deleteFile() throws FileNotFoundException, IOException
	{
		File f1 = new File("C:\\FileHandling\\Screenshot (3).jpg");
		boolean r=f1.delete();
		if(r==true)
			System.out.println("File delete successfully...");
		else 
			System.out.println("File not Found....!");
	}
	
}

class FileHandling1
{
	public static void main(String []args) throws Exception
	{
		FileHandeled f1 = new FileHandeled();
		//f1.createFile();
		//f1.fileInfo();
		//f1.fileWrite();
		//f1.fileRead();
		//f1.bufferedFileWrite();
		//f1.bufferedFileRead();
		//f1.renameFile();
		//f1.copyFile();
		//f1.appenedFile();
		//f1.byteFileWrite();
		//f1.bytefileRead();
		f1.deleteFile();
	}
}