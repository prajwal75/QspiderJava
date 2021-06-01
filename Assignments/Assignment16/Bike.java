class Bike
{
	String name;
	String model;
	String colour;
	int cost;

	Bike(String a,String b,String c,int d)
	{
		name=a;
		model=b;
		colour=c;
		cost=d;
	}
	public static void main(String[] args)
	{
	Bike x=new Bike("yamaha","R15","Red",200000);
	System.out.println(x.name);
	System.out.println(x.model);
	System.out.println(x.colour);
	System.out.println(x.cost);
	
	
	}

}