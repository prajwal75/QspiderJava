class Company
{
	void stock()
	{
		System.out.println("delivered");
	}
}

class Merchant
{
	public static void main(String[] args)
	{
		Company c=new Company();
		shop1.req(c);
		shop2.req(c);
	}
}

class shop1
{
	static void req(Company d)
	{
		d.stock();	
	}
}

class shop2
{
	static void req(Company e)
	{
		e.stock();
	}
}