package abstraction;

interface Laptop{
	void model();
}

class HP implements Laptop{
	public void model(){
		System.out.println("HP");
	}
}
class Dell implements Laptop{
	public void model(){
		System.out.println("Dell");
	}
}
class Acer implements Laptop{
	public void model(){
		System.out.println("Acer");
	}
}
class Stimulator3{
	static void ansim(Laptop l){
		l.model();
	}
}

public class Lap {
	public static void main(String[] args) {
		HP b=new HP();
		Dell o=new Dell();
		Acer a=new Acer();
		Stimulator3.ansim(b);
		Stimulator3.ansim(o);
		Stimulator3.ansim(a);
	}

}
