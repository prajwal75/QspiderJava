interface Puma
{
	void bags();
	
}
interface Nike extends Puma
{
	void shoes();
}
class Rajoutlet implements Nike
{
	public void bags()
	{
		System.out.println("Puma bags");
	}
	public void shoes()
	{
		System.out.println("Nike shoes");
	}

	public static void main(String[] args)
	{
		Rajoutlet r=new Rajoutlet();
		r.bags();
		r.shoes();
	}
}
