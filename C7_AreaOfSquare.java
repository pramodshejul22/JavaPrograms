package AB_46_Batch;

import java.util.Scanner;

public class C7_AreaOfSquare {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of PI");
		double pi=     s1.nextDouble();
		System.out.println("Enter the value of radius");
		double r= s1.nextDouble();
		double area=pi*r*r;
		System.out.println(area);

	}

}
