//7.Create a class person with a private variable
package oops_task;

public class Person_7 {
	 private String name;
	    private int age;

	    
	    public Person_7(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    
	    public String getDetails() {
	        return "Name: " + name + ", Age: " + age;
	    }
}
