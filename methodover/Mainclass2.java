class Whatsapp
{
	static void send(int no)
	{
		System.out.println("Sending num "+no);
	}
	static void send(String txtmsg)
	{
		System.out.println("Sending txtmsg "+txtmsg);
	}
	static void send(int no,String txtmsg)
	{
		System.out.println("Sending num and txtmsg "+no+txtmsg);
	}
	static void send(String txtmsg,int no)
	{
		System.out.println("Sending txt msg and num "+txtmsg+no);
	}
}
class Mainclass2
{
	public static void main(String[] args)
	{
		Whatsapp.send(124);
		Whatsapp.send("hello");
		Whatsapp.send(123,"hi");
		Whatsapp.send("bye",90);
	}
}
