
public class Animal {
//	protected nay de cho lop con co the su
//	dung duoc thuoc tinh nay cua lop cha
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("method eating");
	}

}
