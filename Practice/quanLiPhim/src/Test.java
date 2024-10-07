
public class Test {
	public static void main(String[] args) {
		NgayChieu ngayChieu1 = new NgayChieu(15,05, 2022);
		NgayChieu ngayChieu2 = new NgayChieu(29,02, 2024);
		
		HangSX hangA = new HangSX("Hang A", "Viet Nam");
		HangSX hangB = new HangSX("Hang B", "My");
		
		Phim phim1 = new Phim("Bo gia", 2020, hangA, 100000, ngayChieu1);
		Phim phim2 = new Phim("nguoi nhen", 2025, hangB, 200000, ngayChieu2);
		
		System.out.println("so sanh gia 1 ve hon 2 " + phim1.giaVeRe(phim2));
		
		phim1.tenHangSx();
		phim2.tenHangSx();
		
		System.out.println("Giá sau khi giảm: " + phim1.giaSauKhiGiam(10));
		System.out.println("Giá sau khi giảm: " + phim2.giaSauKhiGiam(50));
	}
}
