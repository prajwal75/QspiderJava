package filehandle;
import java.io.File;
public class Sample1  {
	public static void main(String[] args) {
		File f1=new File("E://dinga");
		if(f1.mkdirs()){
			System.out.println("folder created");
		}
		else{
			System.out.println("folder not created...");
		}
		
		if(f1.exists()){
			System.out.println("folder exists");
		}
		else{
			System.out.println("folder not exists(...");
		}
		
		if(f1.delete()){
			System.out.println("folder deleted");
		}
		else{
			System.out.println("folder not deleted...");
		}
		
	}

}
