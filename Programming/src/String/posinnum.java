package String;

public class posinnum {
	public static void main(String[] args) {
		int no=129637;
		int counterres=count(no);
		int pos=1;
		while(no!=0)
		{
			int rem=no%10;
			if(rem!=9)
			{
				pos++;
			}
			else
			{
				break;
			}
			no=no/10;
			pos=(counterres-pos)-1;
			
		}
		System.out.println(pos);
	}
		static int count(int no)
		{
			int count=0;
			while(no!=0)
			{
				no=no/10;
				count++;
			}
			return count;
		}
	}


