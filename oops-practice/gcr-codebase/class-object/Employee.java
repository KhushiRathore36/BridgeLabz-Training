package OPPSProblem;

public class Employee {
    String name;
    int id;
    int salary;
    Employee(String name,int id,int salary){
    	this.name=name;
    	this.id=id;
    	this.salary=salary;
    }
    public void display() {
    	System.out.println("The Name of the employee is: "+name);
    	System.out.println("The id of the employee is: "+id);
    	System.out.println("The salary of the employee is: "+salary);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp=new Employee("Rohan",1,500000);
        emp.display();
	}

}
