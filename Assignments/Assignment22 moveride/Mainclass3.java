class Clockapp1
{
		void time()
	{
			System.out.println("Show time");
	}
}
class Clockapp2 extends Clockapp1
{
	void time()
	{
		System.out.println("Show time,stopwatch,alaram");
	}

}
class Mainclass3
{
	public static void main(String[] args)
	{
		Clockapp2 c2=new Clockapp2();
		c2.time();
	}
}