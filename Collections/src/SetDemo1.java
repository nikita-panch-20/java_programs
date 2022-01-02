import java.util.*;
public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1=new HashSet<>();
		Set<String> set2=new HashSet<>();
		
		set1.add(35);
		set1.add(67);
		set1.add(37);
		
		set2.add("Hello");
		set2.add("Hi");
		set2.add("Everyone");
		
		Set<Integer> hashToTree1
        = new TreeSet<>(set1);
		Set<String> hashToTree2
        = new TreeSet<>(set2);
		
		System.out.println("Set1: "+hashToTree1);
		System.out.println("Set2: "+hashToTree2);
	}

}
