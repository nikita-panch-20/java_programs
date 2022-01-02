import java.util.*;
public class ArrayListDemo {

	public static void sumAndMean(ArrayList<Integer> al) {
		int sum=0;
		for(Integer data : al)
			sum += data;
		System.out.println("Sum: "+sum);
		System.out.println("Mean: "+(sum/al.size()));
	}
	public static double median(ArrayList<Integer> al) {
		Collections.sort(al);

        if (al.size() % 2 == 1)
            return al.get((al.size() + 1) / 2 - 1);
        else {
            double lower = al.get(al.size() / 2 - 1);
            double upper = al.get(al.size() / 2);

            return (lower + upper) / 2.0;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>al=new ArrayList<>();
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			al.add(sc.nextInt());
		sumAndMean(al);
		System.out.println("Median: "+median(al));
	}

}
