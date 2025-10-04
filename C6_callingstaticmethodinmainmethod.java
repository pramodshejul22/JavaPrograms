package AB_46_Batch;

public class C6_callingstaticmethodinmainmethod
{
	static void addition()
	{
		int a =100;
		int b=2000;
		int sum=a+b;
		System.out.println(sum);
	}
	static void substraction()
	{
		int a =100;
		int b=2000;
		int sub=b-a;
		System.out.println(sub);
	}
	static void mul()
	{
		int a=10;
		int b=20;
		int mul=a*b;
		System.out.println(mul);
	}
	static void div()
	{
		int a=10;
		int b=5;
		int div=a/b;
		System.out.println(div);
	}
	static void mod()
	{
		int a=10;
		int b=2;
		int mod=a%b;
		System.out.println(mod);
	}

	public static void main(String[] args)
	{
		addition();            // o/p 2100
		substraction();      // o/p 1900
		mul();              // o/p 200
		div();              // o/p 2
		mod();              // o/p 0
	}

}
