import java.util.Scanner;

public class phuongTrinhBac1 {
	public static void main(String[] args) {
		double a, b, x;
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhập vào số a: ");
		a = sr.nextDouble();
		System.out.println("Nhập vào số b: ");
		b = sr.nextDouble();
		
		if(a == 0) {
			System.out.println((b == 0) ? "Phương trình vô số nghiệm" : "Phương trình vô nghiệm");
		} else {
			x = -b/a;
			System.out.println("Phương trình có 1 nghiệm duy nhất: " + x);
		}
	}
}
