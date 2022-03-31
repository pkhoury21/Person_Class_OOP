package Lab2_CIS36A;

public class FulltimeEmployee extends Employees{

	private int salary;
	
	public FulltimeEmployee() {
		super();
		salary = 0;
	}

	public FulltimeEmployee(String firstName, String lastName, int id, String department) {
		super(firstName, lastName, id, department);
		salary = 0;
	}
	
	public FulltimeEmployee(String firstName, String lastName, int id, String department, int salary) {
		this(firstName, lastName, id, department); //should "this" be "super" instead?... I feel like I have a-lot of duplicate here but IDK...		
		this.salary = salary;
	}
	
	public FulltimeEmployee(FulltimeEmployee copy) {
		super(copy);
		this.salary = copy.salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "The Full-Time Employee named " + getFirstName() + " " + getLastName() 
		+ ", and the total pay is " + getPay();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FulltimeEmployee other = (FulltimeEmployee) obj;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	@Override
	double getPay() {
		return salary;
	}

	@Override
	int getHours() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getAverageHours() {
		// TODO Auto-generated method stub
		return 0;
	}
}

