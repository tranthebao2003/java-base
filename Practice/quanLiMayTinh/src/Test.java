
public class Test {
	public static void main(String[] args) {
		NgaySX ngay1 = new NgaySX(22, 9, 2002);
		NgaySX ngay2 = new NgaySX(4, 2, 2010);
		
		QuocGia quocgia1 = new QuocGia("VN", "Viet Nam");
		QuocGia quocgia2 = new QuocGia("USA", "Hoa ki");
		
		HangSX hangsx1 = new HangSX("intel", quocgia1);
		HangSX hangsx2 = new HangSX("vinamil", quocgia2);
		
		MayTinh mayTinh1 = new MayTinh(hangsx1, ngay1, 200, 12);
		MayTinh mayTinh2 = new MayTinh(hangsx2, ngay2, 2000, 16);
		
		System.out.println("So sanh gia " + mayTinh1.kiemTraThapHon(mayTinh2));
		mayTinh1.tenQg();
		mayTinh2.tenQg();
	}
}
