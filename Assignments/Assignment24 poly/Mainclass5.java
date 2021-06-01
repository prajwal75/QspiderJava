class Meeting
{
	void meet()
	{
		System.out.println("meeting");
	}
}
class Zoom extends Meeting
{
	void meet()
	{
		System.out.println("Zoom");
	}
}
class Goto extends Meeting
{
	void meet()
	{
		System.out.println("Goto");
	}
}
class Google extends Meeting
{
	void meet()
	{
		System.out.println("Google");
	}
}
class Stim
{
	static void sit(Meeting m1)
	{
		m1.meet();
	}
}
class Mainclass5
{
	public static void main(String[] args)
	{
		Zoom z=new Zoom();
		Goto g=new Goto();
		Google g1=new Google();
		Stim.sit(z);
		Stim.sit(g);
		Stim.sit(g1);
	}
}