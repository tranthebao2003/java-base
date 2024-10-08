
public class Test {
	public static void main(String[] args) {
		Box box = new Box(15);
		System.out.println(box.getValue());
		
//		không dùng generic
//		báo lỗi khi params truyền vào khác type của contructor
//		Box box2 = new Box(25.5); => báo lỗi
//		Box box2 = new Box("mười lăm"); => báo lỗi
		
		
//		Dùng generic: argument là 1 object ko phải kiểu
//		dữ liệu đó là lí do mình truyền Interger thay vì int
		Box2 b1 = new Box2<Integer>(15);
		System.out.println(b1.getValue());
		
		Box2 b2 = new Box2<String>("Hello");
		System.out.println(b2.getValue());
		
		Box2 b3 = new Box2<Double>(232.2);
		System.out.println(b3.getValue());
	}
}
