package Lab2_CIS36A;

public class Person {

	private String firstName;
	private String lastName;
	private int id;
	
	public Person() {
		firstName = " ";
		lastName = " ";
		id = 0;
	}
	
	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	
	public Person (Person copy){ 
		firstName = copy.firstName;
		lastName = copy.lastName;
		id = copy.id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setIdNumber(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getIdNumber() {
		return id;
	}
	
	public String toString() {
		return "First name is..." + firstName + "\nLast name is..." + lastName + "\nID number is..." + id + "\n";
	}
	
	public boolean equals(Object otherObject) {
		if (otherObject == null){
			return false;
			}		
		if(getClass() != otherObject.getClass()) {
			return false;
		}
		Person actualPerson = (Person)otherObject;
		if (firstName.equals(actualPerson.firstName)
				&& lastName.equals(actualPerson.lastName)
				&& id == actualPerson.id) {
			return true;
		}
		return false;
	}
}
