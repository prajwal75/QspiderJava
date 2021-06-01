package exceptiontopic;

class FedexExcep extends Exception
{
	String no;
	FedexExcep(String no)
	{
		this.no=no;
	}
	public String getNo()
	{
		return no;
	}
}

public class Fedex {
	static void coo() throws FedexExcep
	{
		int kg=60;
		if(60<=50){
			System.out.println("OK");
		}
		else{
			throw new FedexExcep("Not ok");
		}
	}
	public static void main(String[] args) {
		try{
			coo();
		}
		catch(FedexExcep e)
		{
			System.out.println(e.getNo());
		}
	}
}
