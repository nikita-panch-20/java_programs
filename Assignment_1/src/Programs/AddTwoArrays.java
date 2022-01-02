package Programs;
import java.util.*;
public class AddTwoArrays {
	public static void addingArrays(int a[],int b[]) {
		int[] c=new int[20];
		System.out.println("The Result is:");
		for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st array:");
		int[] a=new int[sc.nextInt()];
		System.out.println("Enter the size of 2nd array:");
		int[] b=new int[sc.nextInt()];
		
		if(a.length==b.length) {
		System.out.println("Enter the elements in 1st array:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the elements in 2nd array:");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		addingArrays(a,b);
		
		}
		else
			System.out.println("The sizes of arrays are not equal.");
	}

}
