package Inheritance;

public class RestaurantManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker chef = new Chef("Rohit", 101);
        Worker waiter = new Waiter("Amit", 102);

        ((Person) chef).displayPersonInfo();
        chef.performDuties();
        System.out.println();

        ((Person) waiter).displayPersonInfo();
        waiter.performDuties();
	}

}
interface Worker {
    void performDuties();
}


class Person {
    String name;
    int id;

    
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking food.");
    }
}


class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving customers.");
    }
}