package SimpleInterest;
import java.util.*;
public class FindingSimpleInterest {
	public static double findSI(long p,float t, float r) {
		return (p*t*r)/100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		long p=sc.nextLong();
		System.out.println("Enter the time period:");
		float t=sc.nextFloat();
		System.out.println("Enter the rate:");
		float r=sc.nextFloat();
		System.out.println("The Simple Interest:"+(FindingSimpleInterest.findSI(p, t, r)));
	}

}
