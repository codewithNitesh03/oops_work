package oops_task;

public class Person_test2 {
	public static void main(String[] args) {
		Person_2 person = new Person_2("Jitesh");
        
        System.out.println(person.getName()); 
        person.setName("Rajesh");
        System.out.println(person.getName()); 
    }
}
