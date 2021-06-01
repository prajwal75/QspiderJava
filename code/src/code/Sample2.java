package code;

public class Sample2 {
	public static void main(String[] args) {
	//check(36);
	
		int x=128;
	if(check(x))
	{
		System.out.println("passed");
	}
	else if(check(x))
	{
		System.out.println("failed");
	}
}
	
	static boolean check(int n)
	{
		if(n == 0){ 
		    return false; 
		  } 
		  int current = n; 
		  while(current % 5 == 0) { 
		    current /= 5; 
		  } 
		  return true; 
		}
}
		


