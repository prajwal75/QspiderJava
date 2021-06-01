class string
{
	public static void main(String[] args)
	{
		String[] arr=new String[4];
		arr[0]="Hi1";
		arr[1]="Hi2";
		arr[2]="Hi3";
		arr[3]="Hi4";
		System.out.println("-----");
		System.out.println("index value");
		System.out.println("-----");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"\t"+arr[i]);
		}
	}
}