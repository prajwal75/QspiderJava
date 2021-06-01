class Bike
{
	String brand;
	String colour;
	int cost;

	Bike(String brand,String colour,int cost)
	{
		this.brand=brand;
		this.colour=colour;
		this.cost=cost;
	}

	public static void main(String[] args)
	{
		Bike x=new Bike("Yamaha R15","Red",550000);
		System.out.println(x.brand);

		System.out.println(x.colour);

		System.out.println(x.cost);


	}
}