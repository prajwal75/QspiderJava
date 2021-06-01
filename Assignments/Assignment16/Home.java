class Home
{
	String name;
	String colour;
	int cost;

	Home(String a,String b,int c)
	{
		name=a;
		colour=b;
		cost=c;
	
	}
	public static void main(String[] args)
	{
		Home x=new Home("Gokula","Red",2000000);
		System.out.println(x.name);
		System.out.println(x.colour);
		System.out.println(x.cost);
	}
}