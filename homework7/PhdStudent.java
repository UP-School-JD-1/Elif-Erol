import java.util.Date;

public class PhdStudent extends GraduateStudent{
    boolean qualifyingExamTaken;
    
    PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken, double undergraduateGraduationGrade){
    	super(no, name, year, dob, major, advisor, thesis, undergraduateGraduationGrade);
    	this.qualifyingExamTaken = qualifyingExamTaken;
    }
    @Override
    void study() {
    	System.out.println("study hard");
    }
    @Override 
    void writeThesis() {
    	System.out.println("writing phd thesis");
    }
    
    void writePaper() {
    	System.out.println("writing paper");
    }
    @Override
    public String toString() {
    	return "PhdStudent{" +
               "qualifyingExamTaken=" + qualifyingExamTaken +
               '}';
    } 
}
