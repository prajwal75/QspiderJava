class ATM
{
	void bal()
	{
		System.out.println("You have 0 balance");
	}
}
class Balance
{
	public static void main(String[] args)
	{
		ATM a1=new ATM();
		cust1.bal(a1);
		cust2.bal(a1);
	}
}
class cust1
{
	static void bal(ATM v)
	{
		v.bal();
	}
}
class cust2
{
	static void bal(ATM d)
	{
		d.bal();
	}
}