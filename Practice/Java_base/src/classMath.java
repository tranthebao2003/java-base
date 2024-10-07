import java.util.Scanner;

public class classMath {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số a: ");
		a = sc.nextDouble();
		System.out.println("Nhập vào số b: ");
		b = sc.nextDouble();
		
//		hàm trị tuyệt đối
		System.out.println("|a| = " + Math.abs(a));
		
//		hàm tìm min
		System.out.println("min(a,b) = " + Math.min(a, b));
		
//		hàm tìm max
		System.out.println("max(a,b) = " + Math.max(a, b));
		
//		hàm ceil
		System.out.println("ceil(a) = " + Math.ceil(a));
		
//		hàm floor
		System.out.println("floor(a) = " + Math.floor(a));
		
//		hàm căn bậc 2
		System.out.println("sqrt(a) = " + Math.sqrt(a));
		
//		hàm mũ
		System.out.println("a ^ b = " +Math.pow(a, b));
	}
}
