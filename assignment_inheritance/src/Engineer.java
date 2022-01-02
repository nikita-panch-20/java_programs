
public class Engineer extends Employee {
		private String designation;

	public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer eng=new Engineer();
		eng.setDesignation("Developer");
		eng.setId(1001);
		System.out.println("Designation : "+eng.getDesignation());
		System.out.println("Id : "+eng.getId());

	}

}
