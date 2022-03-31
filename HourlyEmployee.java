package Lab2_CIS36A;

import java.util.Arrays;

public class HourlyEmployee extends Employees{

	private double hourlyRate;
	private int hours;
	
	public HourlyEmployee() {
		super();
		hourlyRate = 0.0;
		hours = 0;
	}

	public HourlyEmployee(String firstName, String lastName, int id, String department) {
		super(firstName, lastName, id, department);
		hourlyRate = 0.0;
		hours = 0;
	}
	
	public HourlyEmployee(String firstName, String lastName, int id, String department, double hourlyRate, int hours) {		
		super(firstName, lastName, id, department);
		this.hourlyRate = hourlyRate; 
		this.hours = hours;
	}
	
	public HourlyEmployee(HourlyEmployee copy) {
		super(copy);
		this.hourlyRate = copy.hourlyRate;
		this.hours = copy.hours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursIDKMAYBEgetRidOf() {
		return hours;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hours = hoursPerWeek;
	}
	
	@Override
	public String toString() {
		return "The Hourly Employee named " + getFirstName() + " " + getLastName() + " worked " + getHours() + " hours"
				+ ", The average hours per week are " + getAverageHours() + ", and the total pay for 4 weeks is " + getPay();		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HourlyEmployee other = (HourlyEmployee) obj;
		if (Double.doubleToLongBits(hourlyRate) != Double.doubleToLongBits(other.hourlyRate))
			return false;
		if (hours != other.hours)
			return false;
		return true;
	}

	@Override
	int getHours() {
		return hours;
	}
	
	@Override
	double getAverageHours() {
		return hours / 4.0;
	}
	
	@Override
	double getPay() {
		return (Math.round(((hours * hourlyRate) *10.0)))/10.0;
	}
}

