class Tester
{
	int r=10;
}
class Tista extends Tester
{
	void uliya()
	{
		System.out.println("Hello");
	}
}
class Mainclass3
{
	public static void main(String[] args)
	{
		Tester t1=new Tista();
		System.out.println(t1.r);
		Tista t=(Tista)t1;
		System.out.println(t.r);
		t.uliya();
	}
}