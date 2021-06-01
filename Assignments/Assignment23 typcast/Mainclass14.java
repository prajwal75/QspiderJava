class Cola13
{
	int f=28;
	void disp()
	{
		System.out.println("Bye frnd");
	}

}
class Chungacha extends Cola13
{
	int b=18;
}
class Mainclass14
{
	public static void main(String[] args)
	{
	Cola13 c=new Chungacha();
	System.out.println(c.f);
	c.disp();
	Chungacha d=(Chungacha)c;
	System.out.println(d.f);
	d.disp();
	System.out.println(d.b);
}
	
}