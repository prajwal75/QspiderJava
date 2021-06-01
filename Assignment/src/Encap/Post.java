package Encap;

class Letter
{
	private String content="Its a seceret message";
	private String from="Anomynous";
	public String getcontent()
	{
		return content;
	}
	public String getfrom()
	{
		return from;
	}
	public void setcontent(String content){
		this.content=content;
		}
	public void setfrom(String from){
		this.from=from;
		
	}
}
public class Post {
	public static void main(String[] args) {
		Letter l=new Letter();
		System.out.println(l.getcontent());
		System.out.println(l.getfrom());
		l.setcontent("Live a happy life");
		l.setfrom("Life");
		System.out.println(l.getcontent());
		System.out.println(l.getfrom());
		
	}

}
