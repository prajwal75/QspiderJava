package abstraction;

interface Eng{
	void stream();
}
class EC implements Eng{
	public void stream(){
		System.out.println("Ec");
	}
}
class CS implements Eng{
	public void stream(){
		System.out.println("CS");
	}
}
class Mech implements Eng{
	public void stream(){
		System.out.println("Mech");
	}
}
class Stimulator{
	static void ansim(Eng e){
		e.stream(); 
	}
}
public class Career {
	public static void main(String[] args) {
		EC e=new EC();
		CS c=new CS();
		Mech m=new Mech();
		Stimulator.ansim(e);
		Stimulator.ansim(c);
		Stimulator.ansim(m);
	}

}
