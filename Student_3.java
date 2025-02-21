//3.Demonstrate a getter abd setter method
package oops_task;

public class Student_3 {
    // private variables
    private String name;
    private int age;

    // getter method for name
    public String getName() {
        return name;
    }

    // setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // getter method for age
    public int getAge() {
        return age;
    }

    // setter method for age
    public void setAge(int age) {
        // You can also add validation logic here
        if (age > 0) {
            this.age = age;
        }
    }
}

