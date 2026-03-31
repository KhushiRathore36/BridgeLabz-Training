package EmployeeRolePolymorphism;

public class Manager extends Employee{
	private final double cachedBonus; 

    public Manager(String name, double salary) {
        super(name, salary);
        this.cachedBonus = salary * 0.10; 
    }

    @Override
    double getBonus() {
        return cachedBonus; 
    }
}
