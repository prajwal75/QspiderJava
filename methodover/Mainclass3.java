class Olx
{
	void search(String vehname)
	{
		System.out.println("search by vehical no "+vehname);
	}
	void search(int yor)
	{
		System.out.println("search by year "+yor);
	}
	void search(String vehname,int yor)
	{
		System.out.println("search by vehical name and yor "+vehname+yor);
	}
	void search(int yor,String vehname)
	{
		System.out.println("search by yor and vehical name "+yor+vehname);
	}
}

class Mainclass3 
{
	public static void main(String[] args) 
	{
		Olx l1=new Olx();
		l1.search("Audi");
		l1.search(1947);
		l1.search("Audi",1947);
		l1.search(1947,"Audi");

	}
}
