class IBM_HR
{
	void testengg()
	{
		System.out.println("Opening for job");
	}
}
class Employee
{
	public static void main(String[] args)
	{
		IBM_HR x=new IBM_HR();
		candi1.get(x);
		candi2.get(x);
	}
}
class candi1
{
	static void get(IBM_HR y)
	{
		y.testengg();
	}
}
class candi2
{
	static void get(IBM_HR v)
	{
		v.testengg();
	}
}