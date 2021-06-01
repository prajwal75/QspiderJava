package Encap;

class bit128{
	private String msg="HELLO GOOD MORNING";
	public String getmsg()
	{
		return msg;
	}
	public void setmsg(String msg){
		this.msg=msg;
	}
}
public class Encrypt {
	public static void main(String[] args) {
		bit128 b=new bit128();
		System.out.println(b.getmsg());
		b.setmsg("GOOD NIGHT");
		System.out.println(b.getmsg());
	}

}
