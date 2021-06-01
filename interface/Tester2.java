interface  Demo1
{
	void disp();
	void cool();

}
abstract class Tester implements Demo1
{
	public void disp()
	{
		System.out.println("Disp");
	}
}
class Tester2 extends Tester
{
	public void cool()
	{
		System.out.println("cool");
	}
	
	public static void main(String[] args)
	{
		Tester2 t1=new Tester2();
		t1.disp();
		t1.cool();
	}
}
