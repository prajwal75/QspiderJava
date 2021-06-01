class Recharge
{
	 void pay(int cost)
	{
		System.out.println("Recharge by cost:"+cost);
	}
	void pay(String valid)
	 {
		System.out.println("Recharge by validity:"+valid);
	}
	void pay(int cost,String valid)
	{
		System.out.println("Recharge by cost and validity:"+cost+valid);
	}
	void pay(String valid,int cost)
	{
		System.out.println("Recharge by validity and cost:"+valid+cost);
	}
}
class Mainclass2
{
	public static void main(String[] args)
	{
		Recharge r1=new Recharge();
		r1.pay(599);
		r1.pay("3 months");
		r1.pay(399,"1 month");
		r1.pay("1year",2999);
	}
}
