package calculator;
import java.util.*;
public class calculate {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int subtract(int a, int b) {
		return a-b;
	} 
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int divide(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		
		System.out.println("Addition: "+(calculate.add(a, b)));
		System.out.println("Subtraction: "+(calculate.subtract(a, b)));
		System.out.println("Multiplication: "+(calculate.mul(a, b)));
		System.out.println("Division: "+(calculate.divide(a, b)));

	}

}
