
public class Test {
	public static void main(String[] args) {
		Dog d = new Dog("cho");
		d.eat();
		d.bark();
		
		BabyDog bbd = new BabyDog("cho nho");
		bbd.eat();
		bbd.bark();
		bbd.weep();
		bbd.name = "moi doi";
		System.out.println(bbd.name);
		
		Cat cat1 = new Cat();
		cat1.eat();
		
		Bird b1 = new Bird();
		b1.eat();
		b1.fly();
	}
	
}
