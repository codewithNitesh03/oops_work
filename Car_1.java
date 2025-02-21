//1.Create a class with private attributes and access them methods
package oops_task;

public class Car_1 {
		private String make;
	    private String model;
	    private int year;
	    
	    public Car_1(String make,String model,int year) {
	    	this.make = make;
	    	this.model = model;
	    	this.year = year;
	    }
	    
	    public String getMake() {
	    	return make;
	    }
	    public void setMake(String make) {
	    	this.make = make;
	    }
	    
	    public String getModel() {
	    	return model;
	    }
	    public void setModel(String model) {
	    	this.make = model;
	    }
	    
	    public int getYear() {
	    	return year;
	    }
	    public void setYear(int year) {
	    	this.year = year;
	    }
}
