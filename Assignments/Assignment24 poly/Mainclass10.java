class Andr
{
	void ver()
	{
		System.out.println("ver");
	}
}
class Nougat extends Andr
{
	void ver()
	{
		System.out.println("NOugat");
	}
}
class Oreo extends Andr
{
	void ver()
	{
		System.out.println("Oreo");
	}
}
class Pie extends Andr 
{
	void ver()
	{
		System.out.println("Pie");
	}
}
class Soft
{
	static void conf(Andr a)
	{
		a.ver();
	}
}
class Mainclass10
{
	public static void main(String[] args)
	{
		Nougat n=new Nougat();
		Oreo o=new Oreo();
		Pie p=new Pie();
		Soft.conf(n);
		Soft.conf(o);
		Soft.conf(p);
	}
}