class Lap 
{
		String name;
		String model;
		int cost;

		Lap(String a,String b,int c)
	{

			name=a;
			model=b;
			cost=c;
	}



	public static void main(String[] args) 
	{
		Lap x=new Lap("HP","notebook 15",50000);

		System.out.println(x.name);
		System.out.println(x.model);
		System.out.println(x.cost);
	}
}
