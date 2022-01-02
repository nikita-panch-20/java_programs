import java.util.*;
public class StringExceptionTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String name;
		System.out.println("Enter a number");
		try {
			name=sc.nextLine();
			System.out.println("The number is "+Integer.parseInt(name));
		}
		catch(Exception e) {
			System.out.println("Exception occurred");
		}
		finally {
			System.out.println("Finally block");
		}

}
}
