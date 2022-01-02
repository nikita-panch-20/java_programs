package Programs;
import java.util.*;
public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a natural number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("The sum is "+sum);
	}

}
