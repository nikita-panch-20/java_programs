class Outer{
	int n=9;
	public void show() {
		System.out.println("This is the show method of outer class");
		class Inner{
			int no=16;
			public void display() {
				System.out.println("This is the display method");
			}
		}
		Inner i=new Inner();
		System.out.println(i.no);
		i.display();
	}
}
public class NestedClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer=new Outer();
		System.out.println(outer.n);
		outer.show();

	}

}
