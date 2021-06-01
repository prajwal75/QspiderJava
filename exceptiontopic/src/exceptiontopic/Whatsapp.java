package exceptiontopic;

class Wa extends Exception{
	String msg;
	Wa(String msg){
		this.msg=msg;
	}
	public String getWa(){
		return msg;
	}
}

public class Whatsapp {
	static void sendpic() throws Wa{
		int pic=15;
		if(pic>=20){
			System.out.println("Send");
		}
		else{
			throw new Wa("dont send");
		}
	}
	public static void main(String[] args) {
		try{
			sendpic();
		}
		catch(Wa e){
			System.out.println(e.getWa());
		}
	}
}
