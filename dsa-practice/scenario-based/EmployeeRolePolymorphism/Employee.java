package EmployeeRolePolymorphism;

public abstract class Employee {
	private final String name;
    private final double salary;

    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    protected String getName() {
        return name;
    }

    protected double getSalary() {
        return salary;
    }

    abstract double getBonus();
} 
