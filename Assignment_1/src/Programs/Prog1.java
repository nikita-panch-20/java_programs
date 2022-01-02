package Programs;
import java.util.*;
public class Prog1 {
	
	public static int percentCalculation(int sub1,int sub2,int sub3) {
		int percent=(sub1 + sub2 + sub3)/3;
		return percent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 1st Subject :");
		int sub1=sc.nextInt();
		System.out.println("Enter marks of 2nd Subject :");
		int sub2=sc.nextInt();
		System.out.println("Enter marks of 3rd Subject :");
		int sub3=sc.nextInt();
		int percent=Prog1.percentCalculation(sub1, sub2, sub3);
		if(percent <0 || percent>100)
			System.out.println("INVALID MARKS");
		else if(percent >=0 && percent <40)
			System.out.println("FAIL");
		else if(percent >=40 && percent <50)
			System.out.println("GRADE D");
		else if(percent >=50 && percent <60)
			System.out.println("GRADE C");
		else if(percent >=60 && percent <70)
			System.out.println("GRADE B");
		else if(percent >=70 && percent <80)
			System.out.println("GRADE B+");
		else if(percent >=80 && percent <90)
			System.out.println("GRADE A");
		else
			System.out.println("GRADE A");
	}

}
