import java.util.Date;

public abstract class Student {

	int no;
	String name;
	int year;
	Date dob;
	String major;
	
	Student(int no, string name, int year, Date bod, String major){
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}
	
	abstract void study();
	abstract void register();
	
	@Override
	public String toString() {
		return "Student{"+
	           "no=" + no +
	           ", name='" + name + '\'' +
	           ", year=" + year +
	           ", dob=" + dob +
	           ", major='" + major + '\'' +
	           '}';
	           
	}
}
