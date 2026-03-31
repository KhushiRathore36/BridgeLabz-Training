package EmployeeRolePolymorphism;

public class Developer extends Employee{
	private final double cachedBonus;

    public Developer(String name, double salary) {
        super(name, salary);
        
        this.cachedBonus = (salary > 50000.0) ? (salary * 0.05) : 0.0;
    }

    @Override
    double getBonus() {
        return cachedBonus;
    }
}
