
public class breakContinueReturn {
	public static void main(String[] args) {
//		break
//		không sử dụng label
//		int out, in = 0;
//		for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break;
//			}
//			System.out.println("Bên trong vòng lặp out: out = " + out + ", in = " + in);
//		}
//		System.out.println("Bên ngoài vòng lặp out: out = " + out + ", in = " + in);

//		sử dụng label: outer chính là label của thàng
//		vòng lặp bên ngoài
//		nếu mình dùng break outer thì nó sẽ break thằng
//		vòng lặp có tên như vậy chứ ko phải break thằng
//		vòng lặp gần nó nhất nữa
//		int out, in = 0;
//		outer: for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break outer;
//			}
//			System.out.println("Bên trong vòng lặp out: out = " + out + ", in = " + in);
//		}
//		System.out.println("Bên ngoài vòng lặp out: out = " + out + ", in = " + in);

//		continue : bỏ qua đoạn code bên dưới cotinue và chạy tiếp
//		vòng lặp
//		không sử dụng label
//		int max = 100;
//		for (int i = 0; i < max; i++) {
//			if(i<50)
//				continue;
//			System.out.println(i);
//		}

//		sử dụng label
//		outer: for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 10; j++) {
//				if(i < 5)
//					continue outer;
//				System.out.println(i + " * " + j + " = " + i*j);
//			}
//			System.out.println();
//		}
		
//		return không trả về sử dụng trong hàm void,
//		khi gặp return thì thoát chương trình
	}
}
