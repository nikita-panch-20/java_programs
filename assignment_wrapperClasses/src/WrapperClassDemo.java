import java.util.*;
public class WrapperClassDemo {
	public static void stringToInt() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Integer numbers: ");
		String a=sc.nextLine();
		String b=sc.nextLine();
		System.out.println("The sum is :"+(Integer.parseInt(a)+Integer.parseInt(b)));
	}
	public static void stringToDouble() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Double numbers: ");
		String a=sc.nextLine();
		String b=sc.nextLine();
		System.out.println("The difference is :"+(Double.parseDouble(a)-Double.parseDouble(b)));
	}
	public static void stringToFloat() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Float numbers: ");
		String a=sc.nextLine();
		String b=sc.nextLine();
		System.out.println("The product is :"+(Float.parseFloat(a)*Float.parseFloat(b)));
		System.out.println("The quotient is :"+(Float.parseFloat(a)/Float.parseFloat(b)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringToInt();
		stringToDouble();
		stringToFloat();
	}

}
