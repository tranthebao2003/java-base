import java.util.Scanner;

public class cachGanDuLieu {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		float a;
		System.out.println("Nhập vào số a: ");
		a = sr.nextFloat();
		System.out.println("a = " + a);
		a += 3;
		System.out.println("a += 3 = " + a);
		a -= 2;
		System.out.println("a -= 2 = " + a);
		a *= 3;
		System.out.println("a *= 3 = " + a);
		a /= 5;
		System.out.println("a /= 5 = " + a);
		a %= 12;
		System.out.println("a %= 12 = " + a);
		
	}
}
