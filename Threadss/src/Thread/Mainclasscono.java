package Thread;

class cono {
	
	cono(int a){
		System.out.println("int");
	}
	cono(int a,String b){
		this(80);
		System.out.println("int string");
	}
	cono(String b){
		this(90,"hy");
		System.out.println("string");
	}
	cono(String b,int a)
	{
		this("hy");
		System.out.println("String int");
	}
}

public class Mainclasscono
{
	public static void main(String[] args) {
		new cono("hy",90);
		
	}
	

}

