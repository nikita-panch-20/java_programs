import java.util.*;
public class TestThrow {
	public void checkNumber(int n) {
		if(n>1)
			System.out.println(n*n);
		else
		{
			throw new ArithmeticException("Cannot be calculated");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TestThrow t=new TestThrow();
		System.out.println("Enter a number");
		int n=sc.nextInt();
		t.checkNumber(n);
	}

}
