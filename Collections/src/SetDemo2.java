import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1=new HashSet<>();
		set1.add(4);
		set1.add(2);
		set1.add(10);
		
		Set<Integer> set2=new HashSet<>();
		set2.add(1);
		set2.add(2);
		
		//addAll()
		System.out.println("Before using addAll:\nset1: "+set1+"\nset2: "+set2);
		set2.addAll(set1);
		System.out.println("After using addAll:\nset1: "+set1);
		System.out.println("set2: " +set2);
		
		//retainAll()
		set2.retainAll(set1);
		System.out.println("After using retainAll:\nset1: "+set1+"\nset2: "+set2);
		
		//removeAll()
		set2.add(1);
		set2.add(7);
		System.out.println("Before using removeAll:\nset1: "+set1+"\nset2: "+set2);
		set2.removeAll(set1);
		System.out.println("After using removeAll:\nset1: "+set1+"\nset2: "+set2);
		
	}

}
