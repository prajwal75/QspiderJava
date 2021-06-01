class Book1
{
	static void book(int pages)
	{
		System.out.println("select by total pages:"+pages);
	}
	static void book(String size)
	{
		System.out.println("select by size:"+size);
	}
	static void book(int pages,String size)
	{
		System.out.println("select by total pages and size:"+pages+size);
	}
	static void book(String size,int pages)
	{
		System.out.println("select by size and total pages:"+size+pages);
	}
}
class Mainclass3
{
	public static void main(String [] args)
	{
		Book1.book(200);
		Book1.book("King size");
		Book1.book(200,"small size");
		Book1.book("Long size",300);
	}
}