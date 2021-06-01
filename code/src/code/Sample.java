package code;

public class Sample {
	public static void main(String[] args){
		int x=36;
		int n=5;
		
		if(recur(x,n,1,0)==1)
		{
			System.out.println("Passed");
		}
		else if(recur(x,n,1,0)==0)
		{
			System.out.println("Failed");
		}
	}
	static int recur(int x,int n,int curnum,int cursum)
	{
		int results =0;
		int p=power(n,curnum);
				while(p+cursum<x)
				{
					results+=recur(x,n,curnum+1,p+cursum);
					curnum++;
					p=power(n,curnum);
				}
		if(p+cursum==x)
		{
			results++;
		}
		return results;
	}
	
	static int power(int num,int n)
	{
		if(n==0){
		return 1;
		}
		else if(n%2==0)
		{
			return power(n,num/2)*power(n,num/2);
		}
		else{
			return num*power(n,num/2)*power(n,num/2);
		}
	}
}
