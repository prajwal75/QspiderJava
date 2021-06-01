package samples;

class AgeException extends Exception
{
	
}

class Vote
{
	static void voterage() throws AgeException
	{
		int age=12;
		if(age<18)
		{
			throw new AgeException();
		}else
		{
			System.out.println("valid age");
			
		}
	}
}

public class Age {
	public static void main(String[] args) 
	{
		try{
		Vote.voterage();
		}
		catch(AgeException a)
		{
			System.out.println("handled");
		}
	}

}
