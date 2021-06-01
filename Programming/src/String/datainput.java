package String;
import java.io.*;
public class datainput {
	
	public static void main(String[] args) throws IOException{
		
		DataInputStream dis=new DataInputStream(System.in);
		String line;
		
		System.out.println("enter a=");
		line=dis.readLine();
		int a=Integer.parseInt(line);
		
		System.out.println("enter b");
		line=dis.readLine();
		int b=Integer.parseInt(line);
		
		
		System.out.println(a+b);
		
		/*System.out.println("enter a=");
		int a=Integer.parseInt(dis.readLine());
		System.out.println("enter b");
		int b=Integer.parseInt(dis.readLine());
		System.out.println(a+b);*/
	
	}

}
