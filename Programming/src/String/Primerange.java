package String;

public class Primerange {
	public static void main(String[] args) {
		for(int j=2;j<=100;j++){
		
		int no=j;
		boolean flag=false;
		for(int i=2;i<no;i++)
		{
				if(no%i==0)
				{
					flag=true;
					break;
				}
			
			}
		if(flag==false)
		{
		System.out.print(no+" ");
		}
	
	}
	}
	
	
	
}

