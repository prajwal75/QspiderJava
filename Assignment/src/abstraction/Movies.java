package abstraction;

interface Movie{
	void lan();
}
class Kan implements Movie{
	public void lan(){
		System.out.println("Kannada");
	}
}
class Tel implements Movie{
	public void lan(){
		System.out.println("Telugu");
	}
}
class Tam implements Movie{
	public void lan(){
		System.out.println("Tamil");
	}
}
class Stimulator4{
	static void ansim(Movie m){
		m.lan();
	}
}
public class Movies {
	public static void main(String[] args) {
		Kan k=new Kan();
		Tel t1=new Tel();
		Tam t2=new Tam();
		Stimulator4.ansim(k);
		Stimulator4.ansim(t1);
		Stimulator4.ansim(t2);
	}
}
