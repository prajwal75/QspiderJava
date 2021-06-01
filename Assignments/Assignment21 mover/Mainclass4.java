class Book1
{
	 void book(int pages)
	{
		System.out.println("select by total pages:"+pages);
	}
	 void book(String size)
	{
		System.out.println("select by size:"+size);
	}
	 void book(int pages,String size)
	{
		System.out.println("select by total pages and size:"+pages+size);
	}
	 void book(String size,int pages)
	{
		System.out.println("select by size and total pages:"+size+pages);
	}
}
class Mainclass4
{
	public static void main(String [] args)
	{
		Book1 k1=new Book1();
		k1.book(200);
		k1.book("King size");
		k1.book(200,"small size");
		k1.book("Long size",300);
	}
}