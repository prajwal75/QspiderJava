class Cola1
{
	int f=10;
}
class Chunga extends  Cola1
{
	int d=39;
}
class Mainclass7
{
	public static void main(String[] args)
	{
		Cola1 c=new Chunga();
		System.out.println(c.f);
		Chunga c1=(Chunga)c;
		System.out.println(c1.f);
		System.out.println(c1.d);
	}
}