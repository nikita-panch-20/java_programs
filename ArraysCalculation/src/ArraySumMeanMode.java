import java.util.*;
public class ArraySumMeanMode {
	
	public static int modeOfElements(int a[]) {
	      int maxValue = 0, maxCount = 0, i, j;

	      for (i = 0; i < a.length; ++i) {
	         int count = 0;
	         for (j = 0; j < a.length; ++j) {
	            if (a[j] == a[i])
	            ++count;
	         }

	         if (count > maxCount) {
	            maxCount = count;
	            maxValue = a[i];
	         }
	      }
	      return maxValue;
	   }

	public static int sumOfElements(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum;
		
	}
	public static int avgOfElemnets(int a[]) {
		int average=0,sum=0;
		for(int i=0;i<a.length;i++)
			sum += a[i];
		average=sum/a.length;
		return average;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("The sum of elements is "+sumOfElements(a));
		System.out.println("The average of elements is "+avgOfElemnets(a));
		System.out.println("The mode of elements is "+modeOfElements(a));
	}

}
