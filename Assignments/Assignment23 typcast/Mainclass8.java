class Tester1
{
	int r=19;
	void disp()
	{
		System.out.println("Hello");
	}
}
class Huliyacha extends Tester1
{
	void ho()
	{
		System.out.println("Hy");
	}
}
class Mainclass8
{
	public static void main(String[] args)
	{
		Tester1 t=new Huliyacha();
		System.out.println(t.r);
		t.disp();
		Huliyacha h=(Huliyacha)t;
		System.out.println(h.r);
		h.disp();
		h.ho();
	}
		
}