class This
{
	int java;
	int man;
	int sql;

	This(int java,int man,int sql)
	{
		this.java=java;
		this.man=man;
		this.sql=sql;

	}

	public static void main(String[] args)
	{
		This x=new This(1,1,2);
		System.out.println(x.java);
		System.out.println(x.man);
		System.out.println(x.sql);
	
	}
}