import java.util.Scanner;

public class cacPhepToanCoBan {
	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a = ");
		a = sc.nextInt();
		System.out.println("Nhap vao so b = ");
		b = sc.nextInt();
		
		int tong = a + b;
		System.out.println(a + " + " + b +" = " + tong);
		
		int hieu = a - b;
		System.out.println(a + " - " + b +" = " + hieu);
		
		float thuong = (float)a / b;
		System.out.println(a + " / " + b +" = " + thuong);
		
		int tich = a * b;
		System.out.println(a + " & " + b +" = " + tich);
		
		int chiaLayDu = a % b;
		System.out.println(a + " % " + b + " = " +chiaLayDu);
	}
}
