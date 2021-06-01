class Sample
{
	int a=10;
	void disp()
	{
		System.out.println("hello");
	}
	public static void main(String[] args)
	{
		System.out.println(new Sample().a);
		new Sample().disp();
	}
}