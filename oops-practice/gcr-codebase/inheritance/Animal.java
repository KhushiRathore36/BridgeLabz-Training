package Inheritance;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalHeirarchy dog = new Dog("Buddy", 3);
		AnimalHeirarchy cat = new Cat("Kitty", 2);
		AnimalHeirarchy bird = new Bird("Tweety", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
	}

}
class AnimalHeirarchy {
    String name;
    int age;

    
    AnimalHeirarchy(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends AnimalHeirarchy {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends AnimalHeirarchy {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}


class Bird extends AnimalHeirarchy {

    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}
