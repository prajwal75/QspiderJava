class Hotel
{
	void order()
	{
		System.out.println("Availabel");
	}
}
class  Swiggy
{
	public static void main(String[] args) 
	{
		Hotel h1=new Hotel();
		cust1.get(h1);
		cust2.get(h1);

	}
}
class cust1
{
	static void get(Hotel a)
	{
		a.order();

	}
}
class cust2
{
	static void get(Hotel b)
	{
		b.order();
	}
}