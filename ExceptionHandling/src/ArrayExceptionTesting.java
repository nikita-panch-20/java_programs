import java.util.*;
public class ArrayExceptionTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[5];
		try {
			System.out.println("Enter Array elements:");
			
			try {
				String str="xyz";
				System.out.println(Integer.parseInt(str));
			}
			catch(Exception e) {
				System.out.println("Caught Inner block Exception");
			}
			for(int i=0;i<a.length+1;i++)
				a[i]=sc.nextInt();
			System.out.println("Array elements are ");
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
			ae.getStackTrace();
		}
	}

}
