class Google1
{
	void search()
	{
		System.out.println("Search with text");
	}
}
class Google2 extends Google1
{
	void search()
	{
		System.out.println("Search with text,images and voice");
	}
}
class Mainclass4
{
	public static void main(String[] args)
	{
		Google2 g2=new Google2();
		g2.search();
	}
}