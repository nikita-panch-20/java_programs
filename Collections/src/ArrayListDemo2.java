import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
			al.add(sc.nextInt());
		System.out.println("The numbers are:");
		for(Integer i : al)
			System.out.println(i);
		//System.out.println(al.get(0));
	}

}
