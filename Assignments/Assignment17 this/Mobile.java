class Mobile
{
	String model;
	String colour;
	int cost;

	Mobile(String model,String colour,int cost)
	{
	this.model=model;
	this.colour=colour;
	this.cost=cost;
	}

	public static void main(String[] args)
	{
		Mobile x=new Mobile("Samsung galaxy Y","Red",55000);
		System.out.println(x.model);
		System.out.println(x.colour);
		System.out.println(x.cost);
	}
}