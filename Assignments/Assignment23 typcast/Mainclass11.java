class Cool4
{
	void add()
	{
		System.out.println("Hello");
	}
}
class Goolata extends Cool4
{
	int r=23;
	void disp()
	{
		System.out.println("hyyyy");
	}
}
class Mainclass11
{
	public static void main(String[] args)
	{
		Cool4 c4=new Goolata();
		c4.add();
		Goolata g=(Goolata)c4;
		g.add();
		System.out.println(g.r);
		g.disp();
	}

}