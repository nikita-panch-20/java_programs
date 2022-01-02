import java.util.*;

public class MathMaxDemo {
	public static void minMax(int a ,int b) {
		System.out.println("The maximum number is "+(Math.max(a, b)));
		System.out.println("The minimum number is "+Math.min(a, b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		minMax(a,b);

	}

}
