package baiTapKeThuaAbstract;

public class Test {
	public static void main(String[] args) {
		HangSx h1 = new HangSx("Hãng 1", "viet nam");
		HangSx h2 = new HangSx("Hãng 2", "My");
		
		PhuongTien p1 = new MayBay("máy bay", h1, "Xang");
		PhuongTien p2 = new XeOto("O to", h2, "Xang");
		PhuongTien p3 = new XeDap("Xe dap", h1);
		
		MayBay mb1 = new MayBay("b52", h2, "Dau");
		
		System.out.println("Lấy hãng sx " + p1.layTenHangSx());
		
		p2.batDau();
		
		System.out.println("Lấy vận tốc");
		System.out.println("p1 " + p1.layVanToc());
		System.out.println("p2 " + p2.layVanToc());
		System.out.println("p3 " + p3.layVanToc());
		
		mb1.catCanh();
	}
}
