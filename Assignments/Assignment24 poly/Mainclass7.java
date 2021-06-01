class IPL
{
	void team()
	{
		System.out.println("IPL");
	}
}
class RCB extends IPL
{
	void team()
	{
		System.out.println("RCB");
	}
}
class MI extends IPL
{
	void team()
	{
		System.out.println("MI");
	}
}
class CSK extends IPL
{
	void team()
	{
		System.out.println("CSK");
	}
}
class Cricket
{
	static void game(IPL i)
	{
		i.team();
	}
}
class Mainclass
{
	public static void main(String[] args)
	{
		RCB r=new RCB();
		MI m=new MI();
		CSK c=new CSK();
		Cricket.game(r);
		Cricket.game(m);
		Cricket.game(c);
	}
}