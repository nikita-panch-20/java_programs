import java.util.*;
public class TestThrows {
	public int division(int a,int b)throws ArithmeticException {
		int divide = a/b;
		return divide;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		try {
			System.out.println("Enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			TestThrows tt=new TestThrows();
			System.out.println(tt.division(a, b));
		}
		catch(ArithmeticException e) {
			System.out.println("Exception occured : "+e.getMessage());
		}

	}

}
