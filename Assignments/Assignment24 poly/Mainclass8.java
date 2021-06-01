class Lap
{
	void brand()
	{
		System.out.println("Lap");
	}
}
class Dell extends Lap
{
	void brand()
	{
		System.out.println("Dell");
	}
}
class HP extends Lap
{
	void brand()
	{
		System.out.println("HP");
	}

}
class Lenovo extends Lap
{
	void brand()
	{
		System.out.println("Lenovo");
	}
}
class Manf
{
	static void lap(Lap l)
	{
		l.brand();
	}
}
class Mainclass8
{
	public static void main(String[] args)
	{
		Dell n=new Dell();
		HP h=new HP();
		Lenovo l=new Lenovo();
		Manf.lap(n);
		Manf.lap(h);
		Manf.lap(l);
	}
}