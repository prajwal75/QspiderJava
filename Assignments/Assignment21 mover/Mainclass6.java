class Mobile
{
	 void buy(int cost)
	{
		System.out.println("Buy by cost:"+cost);
	}
	 void buy(String brand)
	{
		System.out.println("Buy by Brand:"+brand);
	}
	 void buy(int cost,String brand)
	{
		System.out.println("Buy by cost and brand:"+cost+brand);
	}
	 void buy(String brand,int cost)
	{
		System.out.println("Buy by brand and cost:"+brand+cost);
	}
}
class Mainclass6
{
	public static void main(String[] args)
	{
		Mobile n1=new Mobile();
		n1.buy(15000);
		n1.buy("nokia");
		n1.buy(15000,"nokia");
		n1.buy("nokia",150000);

	}
}