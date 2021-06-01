class Home
{

	String name;
	String colour;
	int cost;
	 
	 Home(String name,String colour,int cost)
	{
		this.name=name;
		this.colour=colour;
		this.cost=cost;
	}

	public static void main(String[] args)
	{
		Home x=new Home("Gokula","Red",5000000);
		System.out.println(x.name);
		System.out.println(x.colour);
		System.out.println(x.cost);
	}
}