package abstraction;

interface Animal{
	 void noise();
}
class Dog implements Animal{
	 public void noise()
	{
		System.out.println("Bow Bow");
	}
}
class Cat implements Animal{
	 public void noise(){
		System.out.println("Meow meow");
	}
}
class Snake implements Animal{
	public void noise(){
		System.out.println("Bus buss");
	}
}
class Stimulator{
	static void ansim(Animal a){
			a.noise();
	}
}

public class Mainclass {
	public static void main(String[] args) {
		Dog d1=new Dog();
		Cat c1=new Cat();
		Snake s1=new Snake();
		Stimulator.ansim(d1);
		Stimulator.ansim(c1);
		Stimulator.ansim(s1);
	}
}
