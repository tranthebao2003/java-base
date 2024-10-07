import java.util.Scanner;

public class switchCase {
	public static void main(String[] args) {
		/*
		 * switch (integer expression){ case integer expression: .... break;
		 * 
		 * ....
		 * 
		 * default: .... }
		 */

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen tu 0 den 5");

		n = sc.nextInt();
		switch (n) {
		case 2: {

			System.out.println("Thu 2");
			break;
		}
		case 3: {

			System.out.println("Thu 3");
			break;
		}
		case 4: {

			System.out.println("Thu 4");
			break;
		}
		default:
			System.out.println("Nhap du lieu sai");
		}
	}
}
