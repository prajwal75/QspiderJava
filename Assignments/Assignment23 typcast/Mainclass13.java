class Sample2
{
	int r=19;
	void co()
	{
		System.out.println("Helloi");
	}
}
class Haho extends Sample2
{
	void disp()
	{
		System.out.println("Hellllllo");
	}
}
class Mainclass13
{
	public static void main(String[] args)
	{
		Sample2 s=new Haho();
		System.out.println(s.r);
		s.co();
		Haho h=(Haho)s;
		System.out.println(h.r);
		h.co();
		h.disp();
	}
}