class Sample
{
	int x=10;

}
class Test extends Sample
{
	int y=10;
}
class Single
{
	public static void main(String[] args)
	{
	Test t1=new Test();
	System.out.println(t1.x);
	System.out.println(t1.y);
	}

}