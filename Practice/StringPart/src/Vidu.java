import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		String s;
//		System.out.println("Nhập vào chuỗi: ");
//		s = sc.nextLine();
//		System.out.println("-----");
//		
////		hàm length()
//		System.out.println(s.length());
////		hàm charAt(index): lấy ra kí tự ở vị trí bất kì
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println("vị trí " + i + " là: " + s.charAt(i));
//		}
//		
//		
//		char[] arrChar = new char[100];
////		getChars(indexStart, indexEnd + 1, arr, indexStartOfArr): lấy nhiều kí tự ra
//		s.getChars(0, 2, arrChar, 0);
//		System.out.println(arrChar);
		
		
		
//		So sánh chuỗi
//		equals: so sánh có phân biệt chữ hoa, thường
		String s1 = "thebao";
		String s2 = "THEBAO";
		String s3 = "thebao";
		
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		System.out.println();
		
//		equalsIgnoreCase: cũng so sánh nhưng ko phân biệt hoa, thường
		System.out.println("s1 equals s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equals s3: " + s1.equalsIgnoreCase(s3));
		System.out.println();
		
//		hàm compareTo => so sánh > < = : phân biệt chữ hoa thường
//		Nếu ra số âm thì sv1 < sv2
//		Nếu ra số dương thì sv1 > sv3
//		Nếu ra số 0 thì sv1 và sv4 bằng nhau
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn A";
		
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
		
//		Tương tự có hàm compareToIgnoreCase() thì nó không phân biệt chữ hoa thương
//		khi so sanh thôi
		
//		Hàm regionMatches => so sánh 1 đoạn
		String r1 = "TITV.vn";
		String r2 = "tV.v";
		
//		nó so sánh từ kí tự indexStart = 2 của r1, số lượng
//		4 kí tự, so sánh r2 với indexStart = 0
//		ngoài ra hàm này có 1 tham số ở đầu là booleanIgnoreCase
//		true thì bỏ phân biệt hoa thường ngược lại thì có
//		phân biệt
		boolean check = r1.regionMatches(false,2, r2, 0, 4);
		System.out.println(check);
		
//		Hàm startWith => trả về true nếu nó bắt đầu
//		từ 1 chuỗi là 1 tham số truyền vào ngược lại
//		trả về false
		String sdt = "0377253434";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("034"));
		
//		tương tự endWith cũng như thế nhưng thay vì bắt đầu
//		thì là kết thúc
		
//		Cắt, nối thanh thế chuỗi
		String vd1 = "Tran The Bao";
		String vd2 = "N21DCPT";
//		Hàm concat => nối chuỗi và trả về 1 String mới
		String s4 = vd1.concat(vd2);
		System.out.println("s4 = " + s4);
		
//		hàm replace => thay thế chuỗi này bằng chuỗi khác và trả về 1 chuỗi mới
		String s5 = "The Bao";
		String s6 = s5.replaceAll("The", "Tran");
		System.out.println(s6);
		
//		toLowerCase => chuyển về viết thường
//		toUpperCase => chuyển về viết hoa
		
//		trim() => xóa khoảng trắng dư thừa ở đầu, cuối chuỗi
//		subTring(indexStart, indezxEnd + 1) => cắt chuỗi con từ indexStart đến index end
//		hoặc subTring(indexStart) => cắt từ indexStart đến hết chuỗi
		String s10 = "Xin chào các bạn, mình là thế bảo";
		String s11 = s10.substring(0, 4);
		System.out.println(s11);
	}
}
