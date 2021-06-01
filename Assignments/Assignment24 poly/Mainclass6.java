class Eng
{
	void stream()
	{
		System.out.println("Course");
	}
}
class Mech extends Eng
{
	void stream()
	{
		System.out.println("Mech");
	}
}
class CS extends Eng
{
	void stream()
	{
		System.out.println("CS");
	}
}
class EC extends Eng
{
	void stream()
	{
		System.out.println("Ec");
	}
}
class Career
{
	 static void domain(Eng a1)
	{
		a1.stream();
	}
}
class Mainclass6
{
	public static void main(String[] args)
	{
		Mech m=new Mech();
		CS c=new CS();
		EC e=new EC();
		Career.domain(m);
		Career.domain(c);
		Career.domain(e);
	}
}