package Thread;

class Sample3 extends Thread {
	public void run() {
		System.out.println("hi");
		}
}

class Demo2 implements  Runnable
{
	public void run()
	{
		System.out.println("hello");
	}
}

	
public   class Sample2 {
		public static void main(String[] args) {
		// TODO Auto-generated constructor stub
	Sample3 s3=new Sample3();
	Thread th1= new Thread(s3);
	th1.start();
	Demo2 d2=new Demo2();
	Thread th2= new Thread(d2);
	th2.start();
	}
}
