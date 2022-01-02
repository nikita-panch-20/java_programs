package Area;
import java.util.*;
public class FindArea {
	
	public static double calculateArea(int r) {
		return 3.14*r*r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		int r=sc.nextInt();
		System.out.println("The Area of the circle is: "+(FindArea.calculateArea(r)));

	}

}
