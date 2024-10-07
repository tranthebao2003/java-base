import java.util.Scanner;

public class phuongTrinhBac2 {
	public static void main(String[] args) {
		double a, b, c, x1, x2, delta;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào a = ");
		a = sc.nextDouble();
		System.out.println("Nhập vào b = ");
		b = sc.nextDouble();
		System.out.println("Nhập vào c = ");
		c = sc.nextDouble();

		delta = b * b - 4 * a * c;

		if (a == 0) {
			System.out.println("Nhập dữ liệu sai!");
		} else {
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm!");
			} else if (delta == 0) {
				System.out.println("Phương trình có 1 nghiệm kép x1 = x2 = " + -b / (2 * a));
			} else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("X1 = " + x1);
				System.out.println("X1 = " + x2);
			}
		}
	}
}
