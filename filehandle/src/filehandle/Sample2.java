package filehandle;
import java.io.File;
import java.io.IOException;
public class Sample2 {
	public static void main(String[] args) throws IOException {
		File f1=new File("E://qsp.txt");
		if(f1.createNewFile())
		{
			System.out.println("file created..");
		}
		else
		{
			System.out.println("file not created");
			
		}
		
	}

}
