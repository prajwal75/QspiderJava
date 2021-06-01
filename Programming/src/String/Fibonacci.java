public class Fibonacci {
	public static void main(String[] args) {
		int fibo1=0;
		int fibo2=1;
		System.out.print(fibo1+" "+fibo2+" ");
		for(int i=0;i<=10;i++){
		int fibo3=fibo1+fibo2;
		fibo1=fibo2;
		fibo2=fibo3;
		System.out.print(fibo3+" ");
		}
	}

}
