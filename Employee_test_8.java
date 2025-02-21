package oops_task;

public class Employee_test_8 {
	 public static void main(String[] args) {
	      
		 Employee_8 employee = new Employee_8("Raju Varma", 50000);

	        System.out.println("Initial Salary: " + employee.getSalary());
	        employee.setSalary(55000);
	        System.out.println("Updated Salary: " + employee.getSalary()); 
	    }
}
