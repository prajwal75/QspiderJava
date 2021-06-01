class Facebook1
{
	void feat()
	{
		System.out.println("Chat,post");
	}
}
class Facebook2 extends Facebook1
{
	void feat()
	{
		System.out.println("chat,post,stories,commenet,share");
	}
}
class Mainclass2
{
	public static void main(String[] args)
	{
		Facebook2 f2=new Facebook2();
		f2.feat();
	}
}
