import java.util.Scanner;

public class cacPhepToanSoSanh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("Nhập a = ");
		a = sc.nextInt();
		System.out.println("Nhập a = ");
		b = sc.nextInt();
		
//		kết quả so sánh
		System.out.println(a + " == " + b + " : " + (a == b));
		System.out.println(a + " != " + b + " : " + (a != b));
		System.out.println(a + " < " + b + " : " + (a < b));
		System.out.println(a + " <= " + b + " : " + (a <= b));
		System.out.println(a + " > " + b + " : " + (a > b));
		System.out.println(a + " >= " + b + " : " + (a >= b));
		
		System.out.println("Cả 2 số là số chẵn " + (a % 2 == 0 && b % 2 == 0));
		System.out.println("1 trong 2 số là số chẵn " + (a % 2 == 0 || b % 2 == 0));
	}
}
