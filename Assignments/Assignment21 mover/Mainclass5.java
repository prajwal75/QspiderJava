class Mobile
{
	static void buy(int cost)
	{
		System.out.println("Buy by cost:"+cost);
	}
	static void buy(String brand)
	{
		System.out.println("Buy by Brand:"+brand);
	}
	static void buy(int cost,String brand)
	{
		System.out.println("Buy by cost and brand:"+cost+brand);
	}
	static void buy(String brand,int cost)
	{
		System.out.println("Buy by brand and cost:"+brand+cost);
	}
}
class Mainclass5
{
	public static void main(String[] args)
	{
		Mobile.buy(15000);
		Mobile.buy("nokia");
		Mobile.buy(15000,"nokia");
		Mobile.buy("nokia",150000);

	}
}