class cool2
{
	void disp()
	{
		System.out.println("Hello");
	}
}
class Dinga extends cool2
{
	int r=19;
	void tata()
	{
		System.out.println("bye");
	}
}
class Mainclass9
{
	public static void main(String[] args)
	{
		cool2 c=new Dinga();
		c.disp();
		Dinga d=(Dinga)c;
		d.disp();
		d.tata();
		System.out.println(d.r);
	}
}