class Cloth
{
	String colour;
	int cost;
	String size;

	Cloth(String a,int b,String c)
	{
		colour=a;
		cost=b;
		size=c;

	}

		public static void main(String[] args)
	{
			Cloth x=new Cloth("Red",5000,"X");
			System.out.println(x.colour);
			System.out.println(x.cost);
			System.out.println(x.size);
	}
}