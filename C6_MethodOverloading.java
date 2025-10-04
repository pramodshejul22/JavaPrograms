package AB_46_Batch;

public class C6_MethodOverloading 
{
//	static void addition(double a, double b)
//	{
//		double sum=a+b;
//		System.out.println(sum);
//	}
//	static void addition(int a, int b)
//	{
//		int sum=a+b;
//		System.out.println(sum);
//	}
	
	//creating Non static method
	void addition(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void addition(int a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void addition(double a, int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		C6_MethodOverloading m1=new C6_MethodOverloading();
		m1.addition(3.31,9.85);   //calling static method
		m1.addition(78,22);
		
		
		
//		addition(32,64);
//		addition(6.94,9.98);
//		addition(78,63.254);
//		addition(5.32,64);
		

	}

}
