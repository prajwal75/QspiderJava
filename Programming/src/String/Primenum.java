package String;

public class Primenum {
	public static void main(String[] args) {
		int no=76;
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
		System.out.println("Prime");
		}
	else{
		System.out.println("not prime");
		}
		}
	}


