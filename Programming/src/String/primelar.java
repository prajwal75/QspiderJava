package String;

import java.util.Scanner;

public class primelar 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number");
		int a=sc.nextInt();
		for(int j=a;j>=2;j--)
		{
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
					System.out.println("the largest prime no less than "+a+" is "+no);
					//System.out.print(no);
					break;
					}
			}
	}
}
	
	
	

