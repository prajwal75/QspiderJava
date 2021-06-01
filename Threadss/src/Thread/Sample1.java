package Thread;

public class Sample1 {
	public static void main(String[] args) {
		Thread th1=Thread.currentThread();
		System.out.println(th1.getId());
		System.out.println(th1.getName());
		System.out.println(th1.getPriority());
		th1.setPriority(7);
		System.out.println("********a4**********");
		System.out.println(th1.getName());
		System.out.println(th1.getPriority());
		}

}
