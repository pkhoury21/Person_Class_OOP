package Lab2_CIS36A;

public abstract class Employees extends Person{

	private String department;
	
	public Employees() {
		super();
		department = "";
	}
	
	public Employees(String firstName, String lastName, int id) {
		super(firstName, lastName, id);
		department = "";
	}
	
	public Employees(String firstName, String lastName, int id, String department) {
		super(firstName, lastName, id);
		this.department = department;
	}
	
	public Employees(Employees copy) {
		super(copy);
		this.department = copy.department;
	}
	
	public void setDepartment(String department) {
			this.department = department;
	}
		
	public String getDepartment() {
		return department;
	}
	
	abstract int getHours();//
	
	abstract double getAverageHours();//
	
	abstract double getPay();//

	@Override
	public String toString() {
		return "The Employee named" + getFirstName() + " " + getLastName() + ", and works at department " + department;		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		return true;
	}
	
	
}

