class Amazon_v1
{
	 void sell()
	{
		System.out.println("Sell books");
	}
}
class Amazon_v2 extends Amazon_v1
{
		void sell()
	{
		System.out.println("Sell clothes,phones");
		super.sell();
	}
}
class Mainclass2
{
	public static void main(String[] args)
	{
		Amazon_v2 v2=new Amazon_v2();
		v2.sell();
	}
}