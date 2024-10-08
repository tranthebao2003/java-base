
public class Test {
	public static void main(String[] args) {
		EnumTest tkb = new EnumTest(Day.Monday, "toán văn anh");
		EnumTest tkb2 = new EnumTest(Day.Saturday, "Hóa văn anh");
		
		System.out.println(tkb);
		
		
//		test thang enum
		int x = Thang.thang1.soNgay();
		System.out.println(x);
	}
}
