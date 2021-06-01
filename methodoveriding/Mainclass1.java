class Ola_v1
{
	static void ride()
	{
		System.out.println("Ride with cab");
	}

}
class Ola_v2 extends Ola_v1
{
	void ride()
	{
		System.out.println("Ride with cab,auto,bike");
	}
}
class Mainclass1
{
	public static void main(String[] args)
	{
		Ola_v2 v2=new Ola_v2();
		v2.ride();
	}
}