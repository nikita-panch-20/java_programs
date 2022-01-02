import java.util.*;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		System.out.println("Enter no. of strings");
		int n=sc.nextInt();
		System.out.println("Enter the strings");
		for(int i=0;i<=n;i++)
			al.add(sc.nextLine());
		System.out.println("The Strings are:");
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));

	}

}
