class Demo10
{
	double z=19;
	int r=23;

}
class Dumtaka extends Demo10
{
	int c=45;
}
class Mainclass12
{
	public static void main(String[] args)
	{
		Demo10 d=new Dumtaka();
		System.out.println(d.z);
		System.out.println(d.r);
		Dumtaka e=(Dumtaka)d;
		System.out.println(e.z);
		System.out.println(e.r);
		System.out.println(e.c);
	}
}