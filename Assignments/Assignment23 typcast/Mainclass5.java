class Demo1
{
	double z=10;
}
class Dumtaka extends Demo1
{
	int x=20;
}
class Mainclass5
{
	public static void main(String[] args)
	{
		Demo1 d1=new Dumtaka();
		System.out.println(d1.z);
		Dumtaka d=(Dumtaka)d1;
		System.out.println(d.z);
		System.out.println(d.x);
	}
}