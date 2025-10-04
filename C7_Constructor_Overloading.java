package AB_46_Batch;

public class C7_Constructor_Overloading 
{
	C7_Constructor_Overloading()
	{
		System.out.println("1st");
	}
	C7_Constructor_Overloading(int a)
	{
		System.out.println("2nd");
	}
	C7_Constructor_Overloading(int a,int b)
	{
		System.out.println("3rd");
	}
	public static void main(String[] args) 
	{
		C7_Constructor_Overloading C1=new C7_Constructor_Overloading();
		new C7_Constructor_Overloading(500);
		new C7_Constructor_Overloading(500,1000);

	}

}
