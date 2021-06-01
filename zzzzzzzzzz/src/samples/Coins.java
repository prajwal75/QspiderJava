package samples;

public class Coins {
	public static void main(String[] args) {
		int arr[]={1,1,1,0};
		int count=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
				arr[i+1]=arr[i]-1;
				
			}
		}
		System.out.println(count);
		
	}

}
