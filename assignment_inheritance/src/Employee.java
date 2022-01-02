
public class Employee extends HumanBeing {
	
	private int id;
	private double salary;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setName("Nishtha");
		e.setId(1);
		e.setSalary(12000.00);
		System.out.println("-- Employee Details --");
		System.out.println("1. "+e.getName()+" "+e.getId()+" "+e.getSalary());
	}

}
