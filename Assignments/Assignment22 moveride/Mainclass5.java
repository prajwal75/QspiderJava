class Picsart1
{
	void edit()
	{
		System.out.println("Edit brightness and contrast");
	}

}
class Picsart2 extends Picsart1
{
	void edit()
	{
		System.out.println("Edit brightness,contrast,hue and saturation");
	}
}
class Mainclass5
{
	public static void main(String[] args)
	{
		Picsart2 p2=new Picsart2();
		p2.edit();
	}
}