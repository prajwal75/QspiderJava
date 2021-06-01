class App
{
	void send()
	{
		System.out.println("send");
	}
}
class Wa extends App
{
	void send()
	{
		System.out.println("Whatsapp");
	}
}
class Hike extends App
{
	void send()
	{
		System.out.println("Hike");
	}
}
class Tele extends App
{
	void send()
	{
		System.out.println("Telegram");
	}
}
class Stim
{
	static void sit(App a1)
	{
		a1.send();
	}
}
class Mainclass4
{
	public static void main(String[] args)
	{
		Wa w=new Wa();
		Hike h=new Hike();
		Tele t=new Tele();
		Stim.sit(w);
		Stim.sit(h);
		Stim.sit(t);
	}
	}