//2.Prevent direct access to private variable 
package oops_task;

public class Person_2 {
    // private variable
    private String name;

    // public constructor
    public Person_2(String name) {
        this.name = name;
    }

    // public getter method
    public String getName() {
        return name;
    }

    // public setter method
    public void setName(String name) {
        this.name = name;
    }
}
