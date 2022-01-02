import java.util.*;

public class ArrayMathDemo {
	public static void arrayMinMax(int a[]) {
		int min=a[0],max=a[0];
		for(int i=1;i<a.length;i++) {
			//for(int j=i+1;j<a.length;j++) {
				min=Math.min(min, a[i]);
				max=Math.max(max, a[i]);
			//}
		}
		System.out.println("The minimum value: "+min);
		System.out.println("The maximum value: "+max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		arrayMinMax(a);
	}
	

}
