class Lap
{
	static String name="HP";
	String colour;
	int cost;
	public static void main(String[] args)
	{
		Lap x=new Lap();
		x.colour="Black";
		x.cost=45000;
		System.out.println(name);
		System.out.println(x.colour);
		System.out.println(x.cost);
	}
}