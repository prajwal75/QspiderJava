class Movies
{
	void lan()
	{
		System.out.println("lan");
	}
}
class Kan extends Movies
{
	void lan()
	{
		System.out.println("Kannada");
	}
}
class Telugu extends Movies
{
	void lan()
	{
		System.out.println("Telugu");
	}
}
class Tamil extends Movies
{
	void lan()
	{
		System.out.println("Tamil");
	}
}
class Movie
{
	static void field(Movies m)
	{
		m.lan();
	}
}
class Mainclass9
{
	public static void main(String[] args)
	{
		Kan k=new Kan();
		Telugu t=new Telugu();
		Tamil t1=new Tamil();
		Movie.field(k);
		Movie.field(t);
		Movie.field(t1);
	}
}