package EmployeeRolePolymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee manager = new Manager("Alice", 80000);
        System.out.printf("%.2f%n", manager.getBonus()); 

        
        Employee dev1 = new Developer("Bob", 60000);
        System.out.printf("%.2f%n", dev1.getBonus()); 

        Employee dev2 = new Developer("Carol", 40000);
        System.out.printf("%.2f%n", dev2.getBonus()); 
	}

}
