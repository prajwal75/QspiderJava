class Tv
{
	String brand;
	String type;
	int cost;

	Tv(String brand,String type,int cost)
	{
		this.brand=brand;
		this.type=type;
		this.cost=cost;
	}

	public static void main(String[] args)
	{
		Tv x=new Tv("Samsung","LED",200000);
		System.out.println(x.brand);
		System.out.println(x.type);
		System.out.println(x.cost);
	}
}