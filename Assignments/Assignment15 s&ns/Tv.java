class Tv
{
	static String tv="Samsung";
	int cost;
	String model;
	public static void main(String[] args)
	{
		Tv x=new Tv();
		x.cost=30000;
		x.model="OLED";
		System.out.println(tv);
		System.out.println(x.model);
		System.out.println(x.cost);

	}
}