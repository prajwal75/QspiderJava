class Application
{
	void Vc()
	{
		System.out.println("VC");
	}
}
class Imo extends Application
{
	void Vc()
	{
		System.out.println("Imo");
	}
}
class Skype extends Application
{
	void Vc()
	{
		System.out.println("Skype");
	}
}
class Duo extends Application
{
	void Vc()
	{
		System.out.println("Duo");
	}
}
class Stim
{
	static void sit(Application a1)
	{
			a1.Vc();
	}
}
class Mainclass2
{
	public static void main(String[] args)
	{
		Imo i1=new Imo();
		Skype s1=new Skype();
		Duo d1=new Duo();
		Stim.sit(i1);
		Stim.sit(s1);
		Stim.sit(d1);
	}

}