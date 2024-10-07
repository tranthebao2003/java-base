import java.util.Scanner;

public class vongLapWhile {
	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);
		while (x != 0) {
			System.out.println("Nhập x = 0 để thoát, nhập kí tự khác để tiếp tục: ");
			x = sc.nextInt();
		}
		
		int i = 0;
		while(true) {
			System.out.println(i);
			i++;
			if(i == 10) {
				break;
			}
		}
	}
}
