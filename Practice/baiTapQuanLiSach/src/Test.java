
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 5, 2021);
		Ngay ngay2 = new Ngay(12, 5, 2021);
		
		TacGia tacGia1 = new TacGia("Thế Bảo", ngay1);
		TacGia tacGia2 = new TacGia("Thế Hải", ngay2);
		
		Sach sach1 = new Sach("Lập trình C", 5000, 2023, tacGia1);
		Sach sach2 = new Sach("Lập trình java nè", 10000, 2023, tacGia2);
		
		sach1.inTenSach();
		sach2.inTenSach();
		
		System.out.println(sach1.cungNam(sach2));
		System.out.println("Gia sau khi giảm của sách " + sach1.giaSauKhiGiam(10));
		System.out.println("Gia sau khi giảm của sách " + sach1.giaSauKhiGiam(50));
	}
}
