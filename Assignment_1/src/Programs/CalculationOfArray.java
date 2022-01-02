package Programs;
import java.util.*;
public class CalculationOfArray {
	public static int sumOfElements(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static int productOfElements(int arr[]) {
		int prod=1;
		for(int i=0;i<arr.length;i++) {
			prod *= arr[i];
		}
		return prod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter the elements in array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The sum of all elements : "+sumOfElements(arr));
		System.out.println("The product of all elements : "+productOfElements(arr));
		
		
	}

}
