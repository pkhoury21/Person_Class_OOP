package Lab2_CIS36A;

import java.util.ArrayList;

public class Student extends Person{

	private ArrayList<String> transcript;
	private ArrayList<String> classes;
	private ArrayList<String> grades;
	
	public Student() {
		super();
		classes = new ArrayList<String>(1);
		grades = new ArrayList<String>(1);
		classes.add("");
		grades.add("");
	}
	
	public Student(String firstName, String lastName, int id) {
		super(firstName, lastName, id);
		classes = new ArrayList<String>(1);
		grades = new ArrayList<String>(1);
		classes.add("");
		grades.add("");
	}
	
	public Student(String firstName, String lastName, int id, ArrayList<String> classes, ArrayList<String> grades) {
		super(firstName, lastName, id);
		this.classes = new ArrayList<String>(2);
		this.grades = new ArrayList<String>(2);
		this.transcript = new ArrayList<String>(2);
		this.classes.addAll(classes);
		this.grades.addAll(grades);
		for (int index = 0; index < classes.size(); index++) { 
			this.transcript.add(classes.get(index) + ": " + grades.get(index));
		}
	}
	
	public Student(Student copy) {
		super(copy);
		transcript = new ArrayList<String>(10);
		for(String transcriptOld: copy.transcript) {
			transcript.add(new String(transcriptOld));
		}
		classes = new ArrayList<String>(10);
		for(String classOld: copy.classes) {
			classes.add(new String(classOld));
		}
		grades = new ArrayList<String>(10);
		for(String gradesOld: copy.grades) {
			grades.add(new String(gradesOld));
		}
	}

	@Override
	public String toString() {
		return "For Student " + getFirstName() + getLastName() + ", The transcript is...\n" + transcript;//"[classes=" + classes + ", grades=" + grades + "]";
	}

	@Override
	public boolean equals(Object obj) { //generated, is this right?... ALSO add copy constructor...
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (classes == null) {
			if (other.classes != null)
				return false;
		} else if (!classes.equals(other.classes))
			return false;
		if (grades == null) {
			if (other.grades != null)
				return false;
		} else if (!grades.equals(other.grades))
			return false;
		if (transcript == null) {
			if (other.transcript != null)
				return false;
		} else if (!transcript.equals(other.transcript))
			return false;
		return true;
	}
		
}

