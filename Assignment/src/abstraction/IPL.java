package abstraction;
interface IPPL{
	void team();
}

class RCB implements IPPL{
	public void team(){
		System.out.println("RCB");
	}
}
class CSK implements IPPL{
	public void team(){
		System.out.println("CSK");
	}
}
class MI implements IPPL{
	public void team(){
		System.out.println("MI");
	}
}
class Stimulator2{
	static void ansim(IPPL i)
	{
		i.team();
	}
}
public class IPL {
	public static void main(String[] args) {
		RCB r=new RCB();
		CSK c=new CSK();
		MI m=new MI();
		Stimulator2.ansim(r);
		Stimulator2.ansim(c);
		Stimulator2.ansim(m);
		}

}
