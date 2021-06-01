package abstraction;

interface Meetin{
	void meet();
}
class Goto implements Meetin{
	public void meet(){
		System.out.println("Goto meeting");
	}
}
class Gmeet implements Meetin{
	public void meet(){
		System.out.println("Google meet");
	}
}
class Gotoweb implements Meetin{
	public void meet(){
		System.out.println("Goto web");
	}
}
class Stimulator1{
	static void ansim(Meetin m){
		m.meet();
	}
}

public class Meeting {
public static void main(String[] args) {
	Goto g=new Goto();
	Gmeet w=new Gmeet();
	Gotoweb w1=new Gotoweb();
	Stimulator1.ansim(g);
	Stimulator1.ansim(w);
	Stimulator1.ansim(w1);
 }
}
