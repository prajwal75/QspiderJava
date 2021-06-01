class Sample2
{
	void co()
	{
		System.out.println("Hello");
	}
}
class Gulelu
{
	void disp()
	{
		System.out.println("Hy");
	}
}
class Mainclass6
{
	public static void main(String[] args)
	{
		Sample2 s=new Gulelu();
		s.co();
		Gulelu g=(Gulelu)s;
		g.co();
		g.disp();
	}
}