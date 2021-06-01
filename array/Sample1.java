class Sample1
{
	public static void main(String[] args)
	{
		float[] arr=new float[4];
		arr[0]=52.32f;
		arr[1]=48.54f;
		arr[2]=45.54f;
		arr[3]=54.54f;
		System.out.println("---------------");
		System.out.println("index \t value");
		System.out.println("---------------");
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(i+"\t"+arr[i]);
		}
	}

}