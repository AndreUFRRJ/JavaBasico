package entities;

public class Employee implements Comparable<Employee>{
	String name;
	double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public String getName(){
		return this.name;
	}
	public double getSalary() {
		return this.salary;
	}
	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
	}
	@Override
	public String toString() {
		return name+" - "+salary;
	}
}
