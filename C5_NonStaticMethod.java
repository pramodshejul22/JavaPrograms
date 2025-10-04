package AB_46_Batch;

public class C5_NonStaticMethod 
{
    void addition()      // non static method
    {
        System.out.println("Adding 2 numbers");
    }
    void substraction()      // non static method
    {
        System.out.println("substracting 2 numbers");
    }

  
    public static void main(String[] args)    // main method
    {
        C5_NonStaticMethod n1 = new C5_NonStaticMethod(); // assign object to static variable
        n1.addition();  
        n1.substraction(); // use it
        System.out.println("My Main Method");
    }
}

