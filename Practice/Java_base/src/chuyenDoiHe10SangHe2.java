import java.util.Scanner;

public class chuyenDoiHe10SangHe2 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n > 0");
		n = sc.nextInt();
		
		String nhiPhan = "";
//		chi liên tục cho 2 sau đó lấy phần dư
//		sau đó đảo ngược chuỗi
		
		while(n != 0) {
//			cộng nhiPhan ở phía trước để đảo ngược chuỗi
			nhiPhan = n%2 + nhiPhan;
			n /=2;
		}
		System.out.println("Hệ nhi phân của số " + n + " là " + nhiPhan);
	}
}
