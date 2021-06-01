class Recharge
{
	static void pay(int cost)
	{
		System.out.println("Recharge by cost:"+cost);
	}
	static void pay(String valid)
	{
		System.out.println("Recharge by validity:"+valid);
	}
	static void pay(int cost,String valid)
	{
		System.out.println("Recharge by cost and validity:"+cost+valid);
	}
	static void pay(String valid,int cost)
	{
		System.out.println("Recharge by validity and cost:"+valid+cost);
	}
}
class Mainclass1
{
	public static void main(String[] args)
	{
		Recharge.pay(599);
		Recharge.pay("3 months");
		Recharge.pay(399,"1 month");
		Recharge.pay("1year",2999);
	}
}
