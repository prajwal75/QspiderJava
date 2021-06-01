package Encap;

class code{
	private String msg="._.__.._...__.";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
public class Morse {
	public static void main(String[] args) {
		code c=new code();
		System.out.println(c.getMsg());
		c.setMsg("...__.__._..__");
		System.out.println(c.getMsg());
	}
	

}
