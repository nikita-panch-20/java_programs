import java.util.*;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Add 3 elements:");
		for(int i=0;i<3;i++)
			al.add(sc.nextInt());
		System.out.println("Add element in a specific index");
		System.out.println("enter the index");
		int i=sc.nextInt();
		System.out.println("Enter the element");
		al.add(i,sc.nextInt());
		System.out.println("Adding elements of another list");
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(90);
		al1.add(80);
		al.addAll(al1);
		System.out.println("list: "+al);
		System.out.println("Adding element in specific index");
		System.out.println("enter an index");
		i=sc.nextInt();
		al.addAll(i, al1);
		System.out.println("list: "+al);
		System.out.println("Clearing the list");
		al.clear();
		if(al.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("List is not empty");
		
	}

}
