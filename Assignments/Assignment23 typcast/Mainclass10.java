class Tester3
{
	int r=10;
	void disp()
	{
		System.out.println("Hello");
	}
}
class Tista1 extends Tester3
{
	void uliya()
	{
		System.out.println("uliya");
	}
}
class Mainclass10
{
	public static void main(String[] args)
	{
		Tester3 t=new Tista1();
		t.disp();
		System.out.println(t.r);
		Tista1 t1=(Tista1)t;
		System.out.println(t1.r);
		t1.disp();
		t1.uliya();
	}
}
