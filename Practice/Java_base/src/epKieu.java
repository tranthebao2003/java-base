
public class epKieu {
	public static void main(String[] args) {
		int a = 100;
		int b = 2;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
//		ép kiểu ngầm định
		float c = a;
		float d = b;
		
		System.out.println("Ép kiểu ngầm định");
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
//		ép kiểu tường minh, bắt buộc phải có f phía sau để nó hiểu đây là float
		float e = 3.5f;
		float f = 9.5f;
		
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		float g = (int)3.5;
		float h = (int)9.5;
		
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
//		ép kiểu dữ liệu giữa biến nguyên thủy và đối tượng
		int X = new Integer(32);
		System.out.println("X = "  +X);
	}
}
