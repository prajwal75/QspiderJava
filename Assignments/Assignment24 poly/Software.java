class Software
{
	void Create()
	{
		System.out.println("name");
	}
}
class Msword extends Software
{
	void Create()
	{
		System.out.println("Msword");
	}
}
class Msexcel extends Software
{
	void Create()
	{
		System.out.println("Msexcel");
	}
}
class Msppt extends Software
{
	void Create()
	{
		System.out.println("Msppt");
	}
}
class Stim
{
	static void sit()
	{
		static void sit(Software s1)
			a1.Create();
	}
}
class Mainclass1
{
	public static void main()
	{
		Msword m1=new Msword();
		Msexcel m2=new Msexcel();
		Msppt m3=new Msppt();
		Stim.sit(m1);
		Stim.sit(m2);
		Stim.sit(m3);
	}
}