class Demo
{
	int x=10;

}
class Pemocha extends Demo
{
	void ho()
	{
		System.out.println("Hello");
	}
}
class Mainclass
{
	public static void main(String[] args)
	{
		Demo d1=new Pemocha();
		System.out.println(d1.x);
		Pemocha p1=(Pemocha)d1;
		System.out.println(p1.x);
		p1.ho();
	}

		
}