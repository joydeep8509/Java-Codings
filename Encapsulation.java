class Account 
{
	private long acc_no;
	private String name, email, IFSC;
	private double amount;
	
	//public getter and setter method..
	public long getAccNo()
	{
		return acc_no;  
	}
	public void setAccNo(long acc_no)     //2
	{
		this.acc_no = acc_no;
	}
	
	public String getName()     //3  
	{
		return name;
	}
	public void setName(String name)     //2
	{
		this.name = name;
	}
	
	public String getEmail()     //3
	{
		return email;
	}
	public void setEmail(String email)   //2
	{
		this.email = email;
	}
	
	public String getIFSC()     //3
	{
		return IFSC;
	}
	public void setIFSC(String IFSC)    //2
	{
		this.IFSC = IFSC;
	}
	
	public double getAmount()      //3
	{
		return amount;
	}
	public void setAmount(double amount)    //2
	{
		this.amount = amount;
	}
}

class Encap1
{
	public static void main(String []args)
	{
		Account a1 = new Account();
		a1.setAccNo(11980546);
		a1.setName("Ashok Malhotra");
		a1.setEmail("am@gmail.com");     //1
		a1.setIFSC("BOBAM7843");
		a1.setAmount(780054.65);
		
		System.out.println("Account Name : " + a1.getName());
		System.out.println("Account No : " + a1.getAccNo());
		System.out.println("Account EmailId : " + a1.getEmail());    //4
		System.out.println("Account IFSCF Code : " + a1.getIFSC());
		System.out.println("Account Amount : " + a1.getAmount());
	}	
}