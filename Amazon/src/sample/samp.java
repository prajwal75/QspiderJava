package sample;
import java.io.*;

interface I1
{
	void methodI1();
}
interface I2 extends I1
{
	void methodI2();
}

class A1
{
	public String methodA1()
	{
		String strA1="A1";
		return strA1;
	}
	public String toString()
	{
		return "A1";
	}
}
class B1 extends A1 implements I2
{
	public void methodI1()
	{
		System.out.println("One ");
	}
	public void methodI2()
	{
		System.out.println("Two ");
	}
}
class C1 implements I2
{
	public void methodI1()
	{
		System.out.println("Two ");
	}
	public void methodI2()
	{
		System.out.println("One ");
	}
}

abstract class D1 implements I2
{
	public void methodI1(){}
}
public class samp{
	
	public static void main(String[] args) {
		I1 i1=new B1();
		i1.methodI1();
		((I2)i1).methodI2();
		I2 i2=new B1();
		i2.methodI1();
		i2.methodI2();
		String var2=((A1)i1).methodA1();
		System.out.println(var2);
		String var3=((B1)i1).methodA1();
		System.out.println(var3);
		String var4=i1.toString();
		System.out.println(var4);
		String var5=i2.toString();
		System.out.println(var5);
		I1 i3 =new C1();
		String var6=i3.toString();
		Object o1=new B1();
		((I1)o1).methodI1();
		((I2)o1).methodI1();
		((B1)o1).methodI1();
	}
	
}
