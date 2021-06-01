package filehandle;
import java.io.File;
import java.io.FileWriter;
public class filewrite {
	public static void main(String[] args)  throws Exception{
		File f1=new File("E://qsp.txt");
		FileWriter f2=new FileWriter(f1);
		f2.write("hey java");
		System.out.println("data is written");
		f2.flush();
		
		
	}

}
