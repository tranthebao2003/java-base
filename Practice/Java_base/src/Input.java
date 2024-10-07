import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
//		system.in là đọc từ bàn phím
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập họ và tên: ");
		String fullName = sc.nextLine();
		
		System.out.println("Nhập mã sinh viên: ");
		long maSv = sc.nextLong();
		
		System.out.println("Nhập vào điểm thi: ");
		float diemThi = sc.nextFloat();
		
		System.out.println("-------------");
		System.out.println("Họ và tên: " + fullName);
		System.out.println("Mã sinh viên: " + maSv);
		System.out.println("Điểm thi: " + diemThi);
	}
}
