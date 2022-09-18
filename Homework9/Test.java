package Homework9;

public class Test {

	public static void main(String[] args )throws SalaryPaidOnBankException {
		  
        Employee employee = new Employee(22, "Elif", 2022, "engineer") {
			
        @Override
		public void work() {				
			}
		};
		
		System.out.println(employee.toString());
		
        try {
             double salary = employee.calculateSalary();
             if (salary >= 7000) {
                 throw new SalaryPaidOnBankException("salary paid on bank exception");
             }else System.out.println();
            } 
        catch (SalaryPaidOnBankException salaryPaidOnBankException) {
                System.out.println(salaryPaidOnBankException.toString());
            } 
        finally {
               
            }

    }
}