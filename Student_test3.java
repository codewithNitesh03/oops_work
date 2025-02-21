package oops_task;

public class Student_test3 {
	public static void main(String[] args) {
		Student_3 student = new Student_3();
        // Set values using setter methods
        student.setName("Nitesh");
        student.setAge(20);

        // Get values using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());  
    }
}
