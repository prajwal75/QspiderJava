class Fileformat
{
	void format()
	{
		System.out.println("format");
	}
}
class Pdf extends Fileformat
{
	void format()
	{
		System.out.println("Pdf");
	}
}
class Txt extends Fileformat
{
	void format()
	{
		System.out.println("Txt");
	}
}
class Word extends Fileformat
{
	void format()
	{
		System.out.println("word");
	}
}
class Stim
{
	static void sit(Fileformat a1)
	{
		a1.format();
	}
}
class Mainclass3
{
	public static void main(String[] args)
	{
		Pdf p=new Pdf();
		Txt t=new Txt();
		Word w=new Word();
		Stim.sit(p);
		Stim.sit(t);
		Stim.sit(w);
	}
}
