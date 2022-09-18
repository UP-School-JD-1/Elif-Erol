import java.util.Date;
public class UndergraduateStudent extends Student {
 
	String minor;
	
	UndergraduateStudent(int no, String name, int year, Date bod, String major, String minor){
		super(no, name, year, dob, major);
		this.minor = minor;
	}
	
	void study() {
		System.out.println("Study hard");
	}
	
	void register() {
		System.out.println("register for lessons");
	}
	
	public String toString() {
		return "UndergraduateStudent{" +
	           "minor='" + minor + '\'' +
	           '}';
	}
}
