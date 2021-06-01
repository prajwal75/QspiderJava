class Sample
{
	int a=45;
}
class Test extends Sample
{
	int b=54;

}
class Demo extends Sample
{
	int c=56;
}

class cool extends Test
{
	int e=78;
}
class Hybrid
{
	public static void main(String[] args)
	{
		System.out.println("--object in cool--");
		cool c=new cool();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.e);
		System.out.println("--object in Demo--");
		Demo d=new Demo();
		System.out.println(d.a);
		System.out.println(d.c);
	}

}