class OuterClass{
	int n=12;
	public void show() {
		System.out.println("This is the show method of outer class");
	
	}
	
	class InnerClass{
		int innerN=18;
		public void innerMethod() {
			System.out.println("This is the inner method");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer=new OuterClass();
		System.out.println(outer.n);
		outer.show();
		OuterClass.InnerClass inner=outer.new InnerClass();
		System.out.println(inner.innerN);
		inner.innerMethod();
	}

}
