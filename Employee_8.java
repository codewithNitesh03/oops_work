//8.Create class employee with private salary and name varibles, use getter and setter methods to access and modify salary
package oops_task;

public class Employee_8 {
	private String name;
    private double salary;
    
    public Employee_8(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }
}
