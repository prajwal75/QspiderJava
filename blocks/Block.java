class Block
{
	static{
		System.out.println("SIB");
			}
	{
		System.out.println("IIB");
	}

	Block()
	{
		System.out.println("Constructor");

	}

	public static void main(String[] args)
	{
			System.out.println("---ms----");
			new Block();
			System.out.println("----me----");

	}
}
