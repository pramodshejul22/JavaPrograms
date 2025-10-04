package AB_46_Batch;   //Q - Can we have class with combination of static & Non Static menthod

public class Class5 
{
	static void addition()  //static method we can call it using method name
	{
		System.out.println("Additon");
	}
	void substraction()   //Non_static method we can call it using reference variable
	{
		System.out.println("Substraction");
	}
	
	public static void main(String[] args) 
	{
		addition();                 //static method we can call it using method name
		Class5 c1=new Class5();
		c1.substraction();          //by creating object reference variable, we can call non static menthod
	}

}
