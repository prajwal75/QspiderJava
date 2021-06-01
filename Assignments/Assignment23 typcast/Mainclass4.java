class  Cool
{
	void add()
	{
		System.out.println("add");
	}
}
class Goulala extends Cool
{
	void dispu()
	{
		System.out.println("Dispu");
	}
}
class Mainclass4
{
	public static void main(String[] args)
	{
		Cool s = new Goulala();
		s.add();
		Goulala d = (Goulala) s;
		d.add();
		d.dispu();
	}
}