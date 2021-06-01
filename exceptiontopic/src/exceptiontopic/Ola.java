package exceptiontopic;

class OlaException extends Exception{
	String msg;
	OlaException(String msg){
		this.msg=msg;
	}
	public String getRide()
	{
		return msg;
	}
}
public class Ola {
	static void ride() throws OlaException
	{
		int r=8;
		if(r<=4)
		{
			System.out.println("GOOD RIDE");
		}
		else{
			throw new OlaException("BYE BYE");
		}
	}
	public static void main(String[] args) {
		try{
			ride();
		}
		catch(OlaException e)
		{
			System.out.println(e.getRide());
	}
		
	}

}
