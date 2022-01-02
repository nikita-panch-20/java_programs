package Programs;
import java.util.*;

public class MergeTwoArrays {
	public static void mergingArrays(int a[], int b[]) {
		int[] c=new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println("The merged array after sorting is");
		Arrays.sort(c);
		for(int i=0;i<(a.length+b.length);i++)
			System.out.println(c[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st array:");
		int[] a=new int[sc.nextInt()];
		System.out.println("Enter the size of 2nd array:");
		int[] b=new int[sc.nextInt()];
		System.out.println("Enter the 1st array:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the 2nd array:");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		mergingArrays(a, b);
	}

}
