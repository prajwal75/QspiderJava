package String;

public class firstscndlargest {
	public static void main(String[] args) {
		int[] arr={1,23,43,22,10,34,245,3,124,53,98};
		int f=0;
		int s=0;
		int t=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>f)
			{
				t=s;
				s=f;
				f=arr[i];
			}
			else if(arr[i]>s)
			{
				t=s;
				s=arr[i];
			}
			else if(arr[i]>t)
			{
				t=arr[i];
			}
		}
		System.out.println("first largest "+f);
		System.out.println("second largest "+s);
		System.out.println("third largest "+t);
	}

}
