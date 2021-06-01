class Sample
{
	int y=54;
}
class Test extends Sample
{
	int d=56;

}
class Demo extends Sample
{
	int z=564;
}
class Hierarchial
{
	public static void main(String[] args)
	{
		System.out.println("--object in Test--");
		Test t=new Test();
		System.out.println(t.y);
		System.out.println(t.d);
		System.out.println("--object in Demo--");
		Demo d=new Demo();
		System.out.println(d.y);
		System.out.println(d.z);
	}

}