package Encapu;

class Atm {
	
	private int atmpin=1234;
	public int getAtmpin()
		{
	return atmpin;
		}
	
	public void setAtmpin(int atmpin)
	{
		this.atmpin=atmpin;
	}

}
public class ICICI {
	public static void main(String[] args) {
		
		Atm a=new Atm();
		System.out.println(a.getAtmpin());
		a.setAtmpin(2105);
	System.out.println(a.getAtmpin());
	}
}

