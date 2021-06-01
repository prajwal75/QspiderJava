package filehandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class buffread {
	public static void main(String[] args) throws Exception {
		File f1=new File("E://qsp.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader bw=new BufferedReader(fr);
		String s1=bw.readLine();
		while(s1!=null)
		{
			System.out.println(s1);
			s1=bw.readLine();
		}
	}

}
