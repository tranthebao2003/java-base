import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("-----");
		
//		hàm length()
		System.out.println(s.length());
//		hàm charAt(index): lấy ra kí tự ở vị trí bất kì
		for (int i = 0; i < s.length(); i++) {
			System.out.println("vị trí " + i + " là: " + s.charAt(i));
		}
		
		
		char[] arrChar = new char[100];
//		getChars(indexStart, indexEnd - 1, arr, indexStartOfArr): lấy nhiều kí tự ra
		s.getChars(0, 2, arrChar, 0);
		System.out.println(arrChar);
		
		
	}
}
