package Programs;
import java.util.*;
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+" X "+i+" = "+(a*i));
		}
	}

}
