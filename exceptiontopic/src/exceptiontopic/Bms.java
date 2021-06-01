package exceptiontopic;

public class Bms {
	static void book() throws HousefullException
	{
		int num=100;
		if(num<=55){
			System.out.println("availabel");
		}
		else
		{
			throw new HousefullException("Housefull");
		}
	}
	public static void main(String[] args) {
		try{
			book();
		}
		catch(HousefullException q)
		{
			System.out.println(q.getBook());
		}
	}
}
class HousefullException extends Exception
{
	String num;
	HousefullException(String num){
		this.num=num;
	}
	public String getBook()
	{
		return num;
	}
}

