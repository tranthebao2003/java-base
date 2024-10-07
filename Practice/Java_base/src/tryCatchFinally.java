import java.util.Scanner;

public class tryCatchFinally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		try {
			System.out.println("Nhập vao số nguyên n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhập dữ liệu không đúng!");
		} finally {
//			finally này dù lỗi hay không thì nó cũng hiện ra
			System.out.println("Finally!");
		}
		
		System.out.println("giá trị nhập : " + n);
		System.out.println("Kết thúc chương trình");
	}
}
