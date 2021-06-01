class Sample
{
	void disp()
	{
		System.out.println("Hello");
	}
}
class Ampules extends Sample
{
	void tata()
	{
		System.out.println("Hi");
	}
}
class Mainclass2
{
	public static void main(String[] args)
	{
		Sample s1=new Ampules();
		s1.disp();
		Ampules a1=(Ampules)s1;
		a1.disp();
		a1.tata();
	}
}