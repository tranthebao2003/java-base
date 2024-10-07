
public class phepToan1Ngoi {
	public static void main(String[] args) {
		int a = 5;
		boolean b = false;
		System.out.println("-a => gia tri: " + (-a));
		System.out.println("+a => gia tri: " + (+a));
		System.out.println("!b => gia tri: " + (!b));
		
		System.out.println("a = " +a);
//		tăng a lên trước khi xuất ra
		System.out.println("++a = " +(++a));
//		suất ra trước khi tăng a
		System.out.println("a++ = " +(a++));
		System.out.println("a = " +a);
//		tương tự
		System.out.println("--a = " +(--a));
		System.out.println("a-- = " +(a--));
		System.out.println("a = " +a);
	}
}
