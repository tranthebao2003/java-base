
public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(7, 9);
		
//		bị lỗi vì đây là lớp trừu tượng, nó ko thể
//		dùng contructor để tạo ra 1 instance của nó
//		mà phải dùng contructor của class con
//		để tạo
//		Hinh h = new Hinh(td1);
		
//		Hinh là class abstract còn diem là class con
//		của nó nên có thể dùng contructor của class
//		con để tạo ra 1 instance của nó
		Hinh h1 = new Diem(td1);
		
		Hinh h2 = new HinhTron(td1, 5);
		
		Hinh h3 = new HInhChuNhat(td1, 5,10);
		
		System.out.println("DT1 : " + h1.tinhS());
		System.out.println("DT2 : " + h2.tinhS());
		System.out.println("DT3 : " + h3.tinhS());
	}
}
