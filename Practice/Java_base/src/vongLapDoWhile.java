import java.util.Scanner;

public class vongLapDoWhile {
	public static void main(String[] args) {
		int n = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập vào n > 0: ");
			n = sc.nextInt();
		} while (n <= 0);
	}
}
