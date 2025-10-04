package AB_46_Batch;

public class C7_Mainmethod_Overloading 
{

	public static void main(String[] args) 
	{
	
		System.out.println("Main Method");
		C7_Mainmethod_Overloading c1=new C7_Mainmethod_Overloading();
		c1.main();
		main("Ramu",'M');
	}
public void main()
{
	System.out.println("Main method with no argument");
}
public static void main(String name,char Gender)
{
	System.out.println("Main method with argument as string and gender");

}
}
