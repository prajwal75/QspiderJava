package filehandle;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class buffwrite {
	public static void main(String[] args) throws Exception {
		File f1=new File("E://qsp.txt");
		FileWriter fw=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("bye");
		System.out.println("data is written");
		bw.flush();
	}

}
