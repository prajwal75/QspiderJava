class Cloth
{
	String colour;
	String size;
	int cost;

	Cloth(String colour,String size,int cost)
	{
		this.colour=colour;
		this.size=size;
		this.cost=cost;
	}

	public static void main(String[] args)
	{
		Cloth x=new Cloth("Red","X",2000);
		System.out.println(x.colour);
		System.out.println(x.size);
		System.out.println(x.cost);
	}


}