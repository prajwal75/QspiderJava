class Mobiel1
{
	void ram()
	{
		System.out.println("6GB RAM");
	}
}
class Mobile2
{
	void ram()
	{
		System.out.println("12GB RAM");
	}
}
class Mainclass1
{
	public static void main(String[] args)
	{
		Mobile2 m1=new Mobile2();
		m1.ram();
	}
}