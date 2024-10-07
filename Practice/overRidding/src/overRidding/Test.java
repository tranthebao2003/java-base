package overRidding;

public class Test {
	public static void main(String[] args) {
		Animal animal1 = new Animal("dong vat");
		
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		
		animal1.eat();
		animal1.makeSound();
		
		dog1.eat();
		dog1.makeSound();
		
		cat1.eat();
		cat1.makeSound();
	}
}
