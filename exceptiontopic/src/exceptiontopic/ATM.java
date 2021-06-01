package exceptiontopic;

class ATMexcep extends Exception
{
	String msg;
	ATMexcep(String msg){
		this.msg=msg;
	}
	public String getATM(){
		return msg;
	}
}

public class ATM {
	static void withdraw() throws ATMexcep
	{
		int amnt=20000;
		if(amnt>=10000){
			System.out.println("OK to withdraw");
		}
		else{
			throw new ATMexcep("NO balance");
		}
	}
	public static void main(String[] args) {
		try{
			withdraw();
		}
		catch(ATMexcep e)
		{
			System.out.println(e.getATM());
		}
	}
}
